package com.shortcircuit;

/**
 * short-circuit
 * Короткое замыкание
 *
 * #20211026_0801_20/8
 */
public class Main {

    public static void main(String... __) {
        int i = 0;
        i++; // 1
        System.out.println( 0 == 1 && i++ == 2 ); // false
        System.out.println(i); // 1
        System.out.println( 1 == 1 || i++ == 2 ); // false
        System.out.println(i); // 1

        System.out.println( 0 == 1 || i++ == 2 ); // false
        System.out.println(i); // 2
    }
}
