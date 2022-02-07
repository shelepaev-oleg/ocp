package com.mapToObj;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        IntStream i = s.mapToInt(x -> x);
        Stream<Integer> s2 = i.mapToObj(x -> x);
        s2.forEach(System.out::println);
    }
}
