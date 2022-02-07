package com.stringPoolTest;

import java.util.Objects;

/**
 * 20211401_0532_14/1
 */
public class Main {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        /*
        true, т.к. при создании переменной String в специальной области памяти "String Pool" (находится внутри "Heap Space")
        выделяется память для хранения значения переменной, а java так устроена, что разные переменные String,
        но имеющие одинаковое значение указывают на одну и ту же область памяти!
         */
        System.out.println(str1 == str2);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        // true
        System.out.println(str1.equals(str2));

        String str3 = new String("hello");
        String str4 = new String("hello");
        // false
        System.out.println(str3 == str4);
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        // false
        System.out.println(new String("world") == new String("world"));

        Cat cat1 = new Cat();
        cat1.name = "murka";
        Cat cat2 = new Cat();
        cat2.name = "murka";
        // false, т.к. значения объектов хранятся в "Heap Space" в разных участках памяти.
        System.out.println(cat1 == cat2);
        // true
        System.out.println(cat1.equals(cat2));
    }
}

class Cat {
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
