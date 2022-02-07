package com.callmethodfrommethod;

/**
 * #20211111_0721_78/4
 */
public class Main {

    public static void main(String... __) {
    }
}

interface Test {
    void abstractMethod();
    private void privateMethod() {
        abstractMethod();
        staticMethod();
    }
    static void staticMethod() {
//        privateMethod();
    }
}
