package com.privatemethod;

interface Test {
    void method();
    private void privateMethod() {
        method();
    }
    default void defaultMethod() {
        privateMethod();
    }
}

public class Main implements Test {

    @Override
    public void method() {
        System.out.println("!");
    }

    public static void main(String... __) {
        Main m = new Main();
        m.method();
    }
}
