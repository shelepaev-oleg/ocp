package com.xor;

public class Xor {

    public static void main(String[] args) {
        System.out.println(true ^ false);   // true
        System.out.println(false ^ true);   // true
        System.out.println(true ^ true);    // false
        System.out.println(false ^ false);  // false

        System.out.println(0 ^ 0);          // 0
        System.out.println(1 ^ 1);          // 0
    }
}
