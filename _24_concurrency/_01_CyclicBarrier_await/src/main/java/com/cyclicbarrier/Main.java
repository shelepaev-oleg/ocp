package com.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String... __) {
        ok();
    }

    private static void ok () {
        Runnable afterCyclicBarrier = () -> System.out.println("Выполнится после завершения CyclicBarrier");
        CyclicBarrier barrier = new CyclicBarrier(1, afterCyclicBarrier);
        Runnable task = () -> {
            try {
                barrier.await();
            } catch (Exception e) {
            }
        };
        new Thread(task).start(); // Выполнится после завершения CyclicBarrier
    }

    /**
     * Метод будет выполняться бесконечно, т.к. в одном потоке не может быть двойного завершения CyclicBarrier
     */
    private static void wrong() {
        Runnable afterCyclicBarrier = () -> System.out.println("Выполнится после завершения CyclicBarrier");
        CyclicBarrier barrier = new CyclicBarrier(2, afterCyclicBarrier);
        Runnable task = () -> {
            try {
                barrier.await();
                barrier.await();
            } catch (Exception e) {
            }
        };
        new Thread(task).start();
    }
}
