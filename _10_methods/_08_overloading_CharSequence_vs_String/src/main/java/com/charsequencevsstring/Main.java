package com.charsequencevsstring;

/**
 * #20211102_0659_62/4
 */
public class Main {

    static void method(CharSequence c) {
        System.out.println("CharSequence");
    }

    static void method(String c) {
        System.out.println("String");
    }

    static void method(char c) {
        System.out.println("char");
    }

    public static void main(String... __) {
        method("a");
        method(new StringBuilder("a"));
        method('a');
    }
}
