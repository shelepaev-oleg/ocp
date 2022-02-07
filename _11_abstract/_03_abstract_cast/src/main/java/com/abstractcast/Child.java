package com.abstractcast;

abstract class Parent {
    abstract boolean method();
}

public class Child extends Parent {

    @Override
    boolean method() {
        return false;
    }

    public static void main(String... __) {
        var v = (Parent) new Child();
        System.out.println(v.method());
    }
}
