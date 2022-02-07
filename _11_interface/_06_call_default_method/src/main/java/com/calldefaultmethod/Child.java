package com.calldefaultmethod;

/**
 * #20211111_0720_78/4
 */
interface Parent {
    default void method() {
        System.out.println("Parent");
    }
}

public class Child implements Parent {

    public void method() {
        System.out.println("Child");
    }

    void test() {
        Parent.super.method();
    }

    public static void main(String... __) {
        new Child().test();
    }
}
