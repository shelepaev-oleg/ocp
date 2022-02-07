package com.overridemethod;

/**
 * #20211103_0659_62/10
 */
class Parent {
    void method() {
        System.out.println("Parent");
    }
}

public class Child extends Parent {

    protected void method() {
        System.out.println("Child");
    }

    public static void main(String... __) {
        Parent parent = new Child();
        parent.method();
    }
}
