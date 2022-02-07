package com.passrefernce;

/**
 * 20210913_0838_48/2
 */
public class PassReference {

    static void test(StringBuilder sb1, StringBuilder sb2) {
        sb1 = new StringBuilder("x");
        sb2.append("b");
    }

    public static void main(String... __) {
        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("a");
        test(sb1, sb2);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
