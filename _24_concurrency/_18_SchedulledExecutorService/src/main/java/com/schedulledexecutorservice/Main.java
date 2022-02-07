package com.schedulledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * #20211205_0948_166/3
 */
public class Main {

    public static void main(String... __) {
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        try {
            Future<?> f = s.schedule(() -> System.out.println("1"), 1L, TimeUnit.SECONDS);
            Future<?> f2 = s.submit(() -> System.out.println("2"));
            s.execute(() -> System.out.println("3"));
//        } catch (ExecutionException | InterruptedException e) {
        } finally {
            if (s != null) {
                s.shutdown();
            }
        }
    }
}
