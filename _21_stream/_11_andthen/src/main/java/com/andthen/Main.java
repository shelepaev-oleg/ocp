package com.andthen;

import java.util.function.Function;

/**
 * #20211118_0836_254/1
 */
public class Main {

    public static void main(String... __) {
        Function<Integer, Integer> f1 = a -> a + 1;
        Function<Integer, Integer> f2 = a -> a * 10;
        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(2));
    }
}
