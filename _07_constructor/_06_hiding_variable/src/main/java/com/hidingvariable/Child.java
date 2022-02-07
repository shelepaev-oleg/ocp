package com.hidingvariable;

class Parent {
    String s = "Parent";
}

public class Child extends Parent {
    String s = "Child";

    void getParent() {
        System.out.println(super.s);
    }

    void getChild() {
        System.out.println(s);
    }

    public static void main(String... __) {
        Child child = new Child();
        child.getParent();
        child.getChild();
    }
}
