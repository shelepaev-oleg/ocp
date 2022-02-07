package com.primitiveandgenerics;

import java.util.function.Predicate;

public class Main {

    public static void main(String... __) {
        // Дженерик не допускает замену boxed на примитивный тип:
        // System.out.println(check((int i) -> i <= 20));

        // ok
        System.out.println(check((Integer i) -> i <= 20));
    }

    private static boolean check(Predicate<Integer> p) {
        return p.test(25);
    }
}
