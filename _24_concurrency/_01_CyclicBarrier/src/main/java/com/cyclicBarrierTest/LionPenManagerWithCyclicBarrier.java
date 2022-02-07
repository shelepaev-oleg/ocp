package com.cyclicBarrierTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerWithCyclicBarrier {
    /**
     * Удалить животных из клетки
     */
    private void removeAnimals() { System.out.println("Removing animals"); }

    /**
     * Почистить клетку
     */
    private void cleanPen() { System.out.println("Cleaning the pen"); }

    /**
     * Добавить животных в клетку
     */
    private void addAnimals() { System.out.println("Adding animals"); }
    private void performTaskWrapper(CyclicBarrier c1, CyclicBarrier c2) {
        try {
        removeAnimals();
        c1.await();
        cleanPen();
        c2.await();
        addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
        }
    }
    public static void performTask() {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManagerWithCyclicBarrier manager = new LionPenManagerWithCyclicBarrier();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** Pen Cleaned!"));
            for (int i=0; i < 4; i++)
                service.submit(() -> manager.performTaskWrapper(c1, c2));
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
