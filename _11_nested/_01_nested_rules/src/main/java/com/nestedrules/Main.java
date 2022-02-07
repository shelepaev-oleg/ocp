package com.nestedrules;

/**
 * #20210925_0851_78/7
 */
class Outer {

    private int i;

    private void privateMethod() {
        System.out.println("private");
    }

    private void staticInner() {
//        static class StaticInner {} // does not compile
        class StaticInner {} // ok
    }

    class Inner {
        void privateMethod() {
            Outer.this.privateMethod();
            System.out.println(i);
        }
    }

    static class Nested {}
}
public class Main {

    public static void main(String... __) {
        Outer.Inner inner = new Outer().new Inner();
        inner.privateMethod();

        Outer.Nested nested = new Outer.Nested();
    }
}
