package com.countNumbers;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {


    public static void main(String[] args) {
        ForkJoinTask<?> task = new CountNumbers(0, 4); // m2
        ForkJoinPool pool = new ForkJoinPool();
        Object result = pool.invoke(task); // m3
    }
}
