package com.callablevsrunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * #20211202_0716_164/1
 */
public class Main {

    public static void main(String... __) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();
        try {
//            service.submit(() -> Thread.sleep(1000)); // does not compile
            Future<?> r = service.submit(() -> {
                try {
                    Thread.sleep(1000); // ok
                } catch (InterruptedException e) {}
            });
            System.out.println(r.get());

            Future<String> c = service.submit(() -> {
//                Thread.sleep(1000);
                return null;
            });
            System.out.println(c.get());
        } catch (ExecutionException | InterruptedException e) {
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
