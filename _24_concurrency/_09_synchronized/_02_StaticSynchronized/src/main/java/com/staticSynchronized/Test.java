package com.staticSynchronized;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 20210113_0824_195
 */
public class Test {

    private static final int COUNT = 100;

    private static void performTask(CyclicBarrier cb) {
        try {
            TicketManager manager = TicketManager.getInstance();
            manager.sellTickets(1);
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
        }
        // здесь всегда выведется -100
        System.out.println(TicketManager.getInstance().getTicketCount());
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(COUNT);
            CyclicBarrier cb = new CyclicBarrier(COUNT);
            for (int i = 0; i < COUNT; i++) {
                service.submit(() -> performTask(cb));
            }
            // а здесь вывод недетерминирован
            System.out.println(TicketManager.getInstance().getTicketCount());
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
