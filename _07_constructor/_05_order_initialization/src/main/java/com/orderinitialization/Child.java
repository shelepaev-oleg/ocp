package com.orderinitialization;

/**
 * #20210918_0927_42/1
 */
class Parent {

    static StringBuilder sb = new StringBuilder();

    static { sb.append(1); }

    { sb.append(3); }

    Parent() { sb.append(4); }
}

public class Child extends Parent {

    static { sb.append(2); }

    { sb.append(5); }

    Child() { sb.append(6); }

    public static void main(String... __) {
        new Child();
        System.out.println(sb); //123456

        new Parent();
        System.out.println(sb); //12345634
    }
}
