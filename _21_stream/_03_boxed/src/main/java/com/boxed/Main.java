package com.boxed;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * #20211116_0619_266/1
 */
public class Main {

    public static void main(String... __) {
        LongStream.of(1L, 2L, 3L)
                .mapToInt(x -> (int) x)
                .boxed()
                .peek(System.out::println);

        LongStream.of(1L, 2L, 3L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        LongStream.of(1L, 2L, 3L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
    }
}
