package com.peekTest;

import java.util.stream.Stream;

/**
 * #20210214_2013_266
 */
public class Main {

    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print);

        System.out.println();

        Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print);
    }
}
