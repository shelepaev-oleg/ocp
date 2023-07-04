package com.requireNonNull;

import java.util.Objects;

/**
 * java_2023_07_04_1103
 */
public class Main {

    public static void main(String[] args) {
        testRequireNonNull(null);
    }

    private static void testRequireNonNull(final String str) {
        Objects.requireNonNull(str);
    }
}
