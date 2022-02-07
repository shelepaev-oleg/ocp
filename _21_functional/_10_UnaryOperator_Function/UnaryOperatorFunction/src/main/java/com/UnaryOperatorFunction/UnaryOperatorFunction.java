package com.UnaryOperatorFunction;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * #20210223_1717_255
 */
public class UnaryOperatorFunction {

    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * 2;
        Function<Integer, Integer> f = x -> x * 2;

        Stream<Integer> s = Stream.of(1, 2, 3);
        s.map(u).forEach(System.out::println);

        s = Stream.of(1, 2, 3);
        s.map(f).forEach(System.out::println);
    }
}
