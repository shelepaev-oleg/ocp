package com.enumequals;

public class Main {

    public static void main(String... __) {
        Test t = null;
        System.out.println(t.equals(Test.ONE)); // NPE
    }
}

enum Test {
    ONE,
    TWO
}
