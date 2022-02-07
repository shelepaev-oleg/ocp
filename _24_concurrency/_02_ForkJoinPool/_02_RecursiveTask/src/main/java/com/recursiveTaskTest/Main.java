package com.recursiveTaskTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * #20210105_0917
 * RecursiveTask
 */
public class Main {

    public static void main(String[] args) {
        Double[] weights = new Double[10];
        ForkJoinTask<Double> task = new WeighAnimalTask(weights,0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("Sum: "+sum);
    }
}
