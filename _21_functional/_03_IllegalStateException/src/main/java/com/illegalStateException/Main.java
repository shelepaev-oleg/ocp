package com.illegalStateException;

import java.util.stream.Stream;

/**
 * 20210221_1906
 */
public class Main {

    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(2).forEach(System.out::println);
//        stream.limit(2).map(x -> x + "2").forEach(System.out::println);
    }
}
