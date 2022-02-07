package com.callmethod;

public class Main {

    public static void main(String... __) {
    }
}

interface Test {
    void abstractMethod();
    private void privateMethod() {
        abstractMethod();
        privateStaticMethod();
        defaultMethod();
    }
    private static void privateStaticMethod() {
    }
    default void defaultMethod() {
        abstractMethod();
        privateMethod();
        privateStaticMethod();
    }
}
