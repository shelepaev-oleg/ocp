package com.instanceofrules;

/**
 * #20210926_0914_78/10
 */
interface Grandmother {}

class Mother implements Grandmother {}

final class Child extends Mother {}

class Other {}

final class Other2 {}

public class FruitStand {
    public static void main(String... farm) {
        Other other = new Other();
//        System.out.println(other instanceof Mother); // does not compile, классы не в одной иерархии
        System.out.println(other instanceof Grandmother); // false, т.к сравнение идет с интерфейсом вне иерархии

        Other2 other2 = new Other2();
//        System.out.println(other2 instanceof Grandmother); // does not compile, т.к. класс помечен как final

        Child child = new Child();
        System.out.println(child instanceof Mother); // true
        System.out.println(child instanceof Grandmother); // true

    }
}
