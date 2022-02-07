package com.stringEquals;

/**
 * #20210903-0805_14/3
 */
public class StringEquals {

    public static void main(String[] args) {
        String s1 = "test";
        StringBuilder s2 = new StringBuilder("test");
        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2); // error compile

        Integer i = 1;
        Long l = 2L;
        System.out.println(i.equals(l));
//        System.out.println(i == l); // error compile
    }
}
