package com.concat;

/**
 * #20210903_0732_14/3
 */
public class Concat {

    public static void main(String[] args) {
        int i = 1;
//        String s = 2 + i; // error compile

        Object o = null;
        String s = "" + null;
        System.out.println(s);
        System.out.println("" + null);
    }
}
