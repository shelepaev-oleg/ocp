package com.factorialTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        ForkJoinTask<Long> task1 = new FactorialTest(1, 20);
        long start = System.currentTimeMillis();
        Long result = pool.invoke(task1);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(String.format("result = %d", result));

        start = System.currentTimeMillis();
        result = factorialUsingForLoop(20);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(String.format("result = %d", result));

//        ForkJoinTask<Integer> task2 = new FactorialTest(2, 4);
//        Integer result2 = pool.invoke(task2);
//        System.out.println(result2);
    }

    public static long factorialUsingForLoop(long n) {
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
