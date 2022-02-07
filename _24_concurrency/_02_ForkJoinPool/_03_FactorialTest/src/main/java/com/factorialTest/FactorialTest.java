package com.factorialTest;

import java.util.concurrent.RecursiveTask;

/**
 * Расчет факториала числа
 */
public class FactorialTest extends RecursiveTask<Long> {
    /**
     * Начальное значение расчета факториала
     */
    private long start;
    /**
     * Конечное значение расчета факториала
     */
    private long end;

    FactorialTest(long start, long end) {
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        // Будем считать факториал только для трех чисел за раз
        if (end - start <= 3) {
            long res = start;
            for (long i = start + 1; i <= end; i++) {
                res = res * i;
            }
            return res;
        } else {
            long middle = start + ((end - start) / 2);
            RecursiveTask<Long> otherTask = new FactorialTest(start, middle);
            otherTask.fork();
            return new FactorialTest(middle + 1, end).compute() * otherTask.join();
        }
    }
}
