package com.joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * #20211116_0741_278/1
 */
public class Main {

    public static void main(String... __) {
        String result = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> x + "")
                .collect(Collectors.joining());
        System.out.println(result);

        result = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> x + "")
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
