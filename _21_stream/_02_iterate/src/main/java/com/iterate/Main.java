package com.iterate;

import java.util.stream.Stream;

/**
 * #20211115_0828_258/4
 */
public class Main {

    public static void main(String... __) {
        Stream<Integer> s1 = Stream.iterate(0, i -> i + 1);
        s1.limit(5).forEach(System.out::print);

        System.out.println();

        Stream<Integer> s2 = Stream.iterate(0, i -> i < 3, i -> i + 1);
        s2.limit(5).forEach(System.out::print);
    }
}
