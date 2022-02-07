package com.intStreamTest;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * #20210106_1539
 */
public class Main {

    public static void main(String[] args) {
        AtomicLong value1 = new AtomicLong(0);
        final long[] value2 = {0}; // значение этой переменной будет недетерминировано, т.к. она обрабатывается в параллельных потоках
        IntStream.iterate(1, i -> 1)
                .limit(100)
                .parallel()
                .forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1)
                .limit(100)
                .parallel()
                .forEach(i -> ++value2[0]);
        System.out.println(value1 + " " + value2[0]);

//        intStreamToArray();
    }

//    public static void intStreamToArray() {
//        // 1 - 2, 2 - 4
//        int[] first50EvenNumbers = IntStream.iterate(0, i -> i + 2)
//                .limit(50)
//                .toArray();
//
//        System.out.println(first50EvenNumbers.length == 50);
//        System.out.println(first50EvenNumbers[0]);
//    }
}
