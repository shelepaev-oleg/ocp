package com.equalsAndHashCode;

import java.util.Objects;

/**
 * #20210114_0659_12/1
 */
public class Cat {

    public String name;

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = null;
        // false
        System.out.println(c1.equals(c2));

        c1.name = "mur";
        c2 = new Cat();
        c2.name = "mur";
        // true
        System.out.println(c1.equals(c2));

        c1 = null;
        // NullPointerException
        System.out.println(c1.equals(c2));
    }

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
