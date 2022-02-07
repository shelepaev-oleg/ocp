package com.replace;

/**
 * #20211031_1904_14/5
 */
public class Main {

    public static void main(String... __) {
        String str = "12345";
        System.out.println(str.charAt(1));
//        System.out.println(str.replace(0, 2, "9")); // does not compile
        System.out.println(str.replace("1", "9"));

        StringBuilder sb = new StringBuilder("12345");
        System.out.println(sb.charAt(1));
        System.out.println(sb.replace(0, 2, "9")); // ok
    }
}
