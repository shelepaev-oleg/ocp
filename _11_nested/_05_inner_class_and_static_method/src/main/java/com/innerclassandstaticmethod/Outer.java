package com.innerclassandstaticmethod;

public class Outer {

    class Nested {}
    static class Inner {}

    public static void main(String... __) {
        Nested nested = new Outer().new Nested();
//        Nested nested2 = new Nested();
        Inner inner = new Inner();
        Inner inner2 = new Outer.Inner();
    }

    public void method() {
        new Nested();
        new Inner();
        new Outer().new Nested();
        new Outer.Inner();
    }
}
