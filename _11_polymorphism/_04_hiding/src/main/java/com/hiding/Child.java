package com.hiding;

/**
 * #20210922_0758_62/8
 */
class Parent {
    public static String s;

    void setName(String q) { s = q; }
}

public class Child extends Parent  {

    static String s;

    void setName(String q) { s = q; }

    public static void main(String... __) {
        Child c = new Child();
        c.setName("Child");

        System.out.println(c.s); // Child

        Parent p = c;
        p.setName("Parent");

        System.out.println(c.s); // Parent, т.к. переменная s родительского класса Parent скрыта
        System.out.println(p.s); // null

        p.s = "Parent";
        System.out.println(p.s); // Parent

        Parent p2 = new Parent();
        p2.s = "Parent";
        System.out.println(p2.s); // Parent
    }
}
