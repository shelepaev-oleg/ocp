package com.implicitNarrowing;

/**
 * #20201224_0720
 */
public class Main {

    public static void main(String[] args) {
//        int i = 10; // error
        final int i = 10;
        byte b = i;

        passShort(b);
    }

    private static void passShort(byte b) {

    }
}
