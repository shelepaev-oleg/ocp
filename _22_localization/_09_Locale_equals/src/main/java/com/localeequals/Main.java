package com.localeequals;

import java.util.Locale;

/**
 * public static final Locale US = createConstant("en", "US");
 */
public class Main {

    public static void main(String... __) {
        Locale l1 = Locale.US;
        Locale l2 = new Locale("en", "US");
        System.out.println(l1.equals(l2)); // true
        System.out.println(l1 == l2); // false
    }
}
