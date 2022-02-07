package com.overloadedmethod;

/**
 * #20210917_0734_44/6
 */
public class OverloadedMethod {

    public static void main(String... __) {
        Parent parent = new Child();
        parent.test();
    }
}

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void test() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    @Override
    protected void test() {
        System.out.println("Child");
    }
}
