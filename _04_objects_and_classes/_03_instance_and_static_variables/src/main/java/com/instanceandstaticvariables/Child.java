package com.instanceandstaticvariables;

/**
 * #20211104_0838_42/3
 */
class Parent {
    int i = 0;
    void test() { System.out.println("Parent"); }
    int getI() { return i; }
}

public class Child extends Parent {
    int i = 1;
    void test() { System.out.println("Child"); }
    int getI() { return i; }

    public static void main(String... __) {
        Parent parent = new Child();
        System.out.println(parent.i);
        System.out.println(parent.getI());
        parent.test();
    }
}
