package com.allMatchNoneMatchAnyMatch;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 20210223_1130_260
 */
public class Main {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1, x -> ++x);
        System.out.println(s.anyMatch(x -> x % 2 == 0));

        s = Stream.iterate(1, x -> ++x);
        System.out.println(s.noneMatch(x -> x % 2 == 0));

        // не зависает
        s = Stream.iterate(1, x -> ++x);
        System.out.println(s.allMatch(x -> x % 2 == 0));

        IntStream i = IntStream.iterate(1, x -> ++x);
        System.out.println(i.allMatch(x -> x % 2 == 0));

        // Ряд фибоначи
        Stream.iterate(
                new long[] { 1, 1 },
                p -> new long[] { p[1], p[0] + p[1] })
                .limit(5)
                .forEach(p -> System.out.println(String.format("[%d, %d]", p[0], p[1])));

        // зависает
//        s = Stream.iterate(1, x -> ++x);
//        System.out.println(s.allMatch(x -> x % 1 == 0));

//        s = Stream.generate(() -> 2);
//        System.out.println(s.allMatch(x -> x % 2 == 0));
    }
}
