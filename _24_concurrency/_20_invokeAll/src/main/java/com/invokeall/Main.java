package com.invokeall;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Запуск нескольких потоков
 */
public class Main {

    public static void main(String... __) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<String> task1 = () -> "Ok";
        Callable<String> task2 = () -> {
            throw new RuntimeException();
        };
        Callable<String> task3 = () -> {
            Thread.sleep(1000);
            return null;
        };
        List<Future<String>> result = executorService.invokeAll(List.of(task1, task2, task3));
        System.out.println(result.get(0).get()); // Ok
        executorService.shutdown();
    }
}
