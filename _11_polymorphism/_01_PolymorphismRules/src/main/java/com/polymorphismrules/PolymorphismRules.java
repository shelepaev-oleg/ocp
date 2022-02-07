package com.polymorphismrules;

/**
 * #20210916_0810_64/1
 */
public class PolymorphismRules {

    public static void main(String... __) {
        Child child = new Child();
        child.setI(1);

        Parent parent = child;

        Child child2 = (Child) parent;
        System.out.println(child2);
        child2.setI(2);
        System.out.println(child);

        Parent parent2 = new Parent();
        Child child3 = (Child) parent2; // ClassCastException
        System.out.println(child3);
    }
}
