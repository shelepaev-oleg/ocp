package com.integerVsFloat;

/**
 * #20211218_0722_62/3
 * https://www.geeksforgeeks.org/method-overloading-autoboxing-widening-java/
 * https://www.javatpoint.com/method-overloading-in-java
 */
public class Main {

    public void print(Integer x) {
        System.out.println("Integer");
    }

    public void print(float x) {
        System.out.println("float");
    }

    public void print(Object x) {
        System.out.println("Object");
    }

    public void print(long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Main m = new Main();
        short s = 123;
        m.print(s); // float, т.к. сначала пытается преобразовать в примитивный
        m.print(true); // Object
        m.print(6.789); // Object
    }
}
