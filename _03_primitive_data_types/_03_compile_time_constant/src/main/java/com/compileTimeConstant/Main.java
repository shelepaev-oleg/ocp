package com.compileTimeConstant;

/**
 * #20201223_0800_6
 */
public class Main {

    public static void main(String[] args) {
        int val;

        // ok
        final int i = 0;

        // error
//        int i = 0;

        if (i == 0) {
            val = 10;
        }
//        else { // ok, т.к. один statement
//            val = 20;
//        }

        // error, т.к. разные statement
//        if (i != 0) {
//            val = 10;
//        }
        System.out.println(val);
    }
}
