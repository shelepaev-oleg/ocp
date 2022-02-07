package com.intern;

/**
 * #20211031_1828_14/4
 */
public class Main {

    public static void main(String... __) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s2.intern()); // true
        System.out.println(s1 == s2); // false
        System.out.println(s1.intern() == s2); // false
    }
}
