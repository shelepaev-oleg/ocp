package com.callhiddent;

/**
 * #20211020_0626_78/4/1
 */
public class Main implements Test {

    @Override
    public void method() {
        System.out.println("Main");
    }

    void method2() {
        Test.super.method();
    }

    public static void main(String... __) {
        Main main = new Main();
        main.method();
        main.method2();
    }
}

interface Test {
    default void method() {
        System.out.println("Test");
    }
}
