package com.hashCodeTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 20210114_0700_12/2
 */
public class Dog {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(new Dog("1"));
        dogSet.add(new Dog("1"));
        // true, т.к. не переопределен hashCode()
        System.out.println(dogSet.size() == 2);

        HashMap<Dog, String> map = new HashMap<>();
        map.put(new Dog("2"), "2");
        map.put(new Dog("2"), "2");
        // true, т.к. не переопределен hashCode()
        System.out.println(map.size() == 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
