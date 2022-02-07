package com.finallytest;

/**
 * #20211004_0853_408/4
 */
public class Main {

    public static void main(String... __) {
        System.out.println(method()); // 2
    }

    static String method() {
        try {
            return "1";
        } finally {
            return "2";
        }
    }
}
