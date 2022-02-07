package com.compose;

import java.util.function.Function;

/**
 * #20211117_0707_254/1
 */
public class Main {

    public static void main(String... __) {
        Function<Integer, Integer> f1 = a -> a + 1;
        Function<Integer, Integer> f2 = a -> a * 10;
        Function<Integer, Integer> c = f1.compose(f2);
        System.out.println(c.apply(2)); // 21
    }
}
