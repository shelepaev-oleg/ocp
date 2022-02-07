package com.recutsiveActionTest;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * #20210105_0854
 * RecursiveAction
 *
 * Условие задачи:
 * В зоопарке необходимо взвестить животных.
 * Поручаем работнику (потоку) взвесить животных за один час.
 * Работник может взвесить только 3-х животных за один час.
 * Поэтому, если у работника больше трех животных на взвешивание, то работник делит число животных попалам.
 */
public class Main {

    public static void main(String[] args) {
        Double[] weights = new Double[10];
        ForkJoinTask<?> task = new WeighAnimalAction(weights,0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        // Print results
        System.out.println();
        System.out.print("Weights: ");
        Arrays.asList(weights).stream().forEach(
                d -> System.out.print(d.intValue()+" "));
    }
}
