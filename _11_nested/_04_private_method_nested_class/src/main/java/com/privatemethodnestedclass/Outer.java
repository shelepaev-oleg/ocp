package com.privatemethodnestedclass;

/**
 * #20211023_0748_78/8/1
 */
public class Outer {

    class Nested {
        void privateMethod() {};
    }

    void method() {
        new Nested().privateMethod();
    }

    public static void main(String... __) {
        new Outer().new Nested().privateMethod(); // ok
//        new Nested().privateMethod(); // does not compile
    }
}
