package com.groupingby;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * #20211117_0642_280/3
 */
public class Main {

    public static void main(String... __) {
        Predicate<String> p = String::isEmpty;
        Predicate<String> n = p.negate();
        var result = Stream.generate(() -> "*")
                .limit(10)
                .filter(n)
                .collect(Collectors.groupingBy(s -> s));
        System.out.println(result);

        var result2 = Stream.generate(() -> "*")
                .limit(10)
                .filter(n)
                .collect(Collectors.partitioningBy(n));
        System.out.println(result2);
    }
}
