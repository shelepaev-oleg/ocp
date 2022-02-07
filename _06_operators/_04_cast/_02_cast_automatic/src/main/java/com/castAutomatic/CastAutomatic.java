package com.castAutomatic;

/**
 * #20210820_0708_20/4
 */
public class CastAutomatic {

    public static void main(String[] args) {
        // 1. Assigment operators
        int i = 1;
        i += 1.2f;
        System.out.println(i); // 2

        // 2. final
        final int j = 1;
        byte b = j + 1;

        // но так ошибка:
        final float f = 1.2f;
//        i = f + 1; // error compilet
    }
}
