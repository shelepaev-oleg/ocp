package com.sum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * #20211116_0702_278/1
 */
public class Main {

    public static void main(String... __) {
        var is = IntStream.empty();
        System.out.println(is.sum()); // 0

        is = IntStream.empty();
//        System.out.println(is.average().getAsDouble()); // NoSuchElementException
//
//        is = IntStream.of(0);
//        System.out.println(is.max().getAsInt()); // 0
//
//        is = IntStream.empty();
//        System.out.println(is.count()); // 0

        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list.stream().mapToInt(x -> x).sum());
        System.out.println(list.stream().mapToInt(x -> x).count());
        System.out.println(list.stream().mapToInt(x -> x).max().getAsInt());
        System.out.println(list.stream().mapToInt(x -> x).average().getAsDouble());
    }
}
