package com.equalityOperator;

/**
 * #20210907_0611_14/3
 */
public class EqualityOperator {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); // true

        String s3 = "abc";
        String s4 = "";
        s3 += "abc";
        System.out.println(s3 == s4);; // false, т.к. по разному создаются

        String s5 = new String("abc");
        String s6 = "abc";
        System.out.println(s5 == s6); // false, т.к. по разному создаются
    }
}
