package com.callableTest;

import java.util.concurrent.*;

/**
 * 20210112_0809_162/2
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Callable<String> callable = () -> "Hello, world!";
            Future<?> future1 = executorService.submit(callable);
            System.out.println(future1.get());

            Future<?> future2 = executorService.submit(() -> {
                int i = 2 + 2;
            });
            System.out.println(future2.get());
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
