package com.executorservicetest;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * #20211204_0939_166/1
 */
public class Main {

    private static Runnable takeNap() {
        return () -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };
    }

    public static void main(String... __) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        } finally {
            if (service != null) {
                service.shutdown();

//                List<Runnable> rejected = service.shutdownNow();
//                System.out.println(rejected.size());
            }
        }
        boolean b = service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println(b);
    }
}
