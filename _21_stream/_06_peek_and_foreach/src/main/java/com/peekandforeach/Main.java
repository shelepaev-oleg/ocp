package com.peekandforeach;

import java.util.stream.Stream;

/**
 * 1
 * 2
 * 3
 * 3
 */
public class Main {

    public static void main(String... __) {
        Stream.of(1, 2, 3)
                .peek(System.out::println)
                .filter(i -> i > 2)
                .forEach(System.out::println);
    }
}
