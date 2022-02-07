package com.implicitcast;

public class ImplicitCast {

    public static void main(String... __) {
        Test test = new Test((short) 1);
    }
}

class Test {
    public Test(int i) {
        System.out.println(i);
    }
}
