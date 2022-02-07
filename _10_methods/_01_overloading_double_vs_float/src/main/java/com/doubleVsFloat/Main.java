package com.doubleVsFloat;

/**
 * #20211218_0700_62
 * https://www.geeksforgeeks.org/method-overloading-autoboxing-widening-java/
 * https://www.javatpoint.com/method-overloading-in-java
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        short s1 = 11, s2 = 11;
        System.out.println(Adder.add(s1, s2));
        byte b1 = 11, b2 = 11;
        System.out.println(Adder.add(b1, b2));
        System.out.println(Adder.add(12.3, 12.6));
        System.out.println(Adder.add(1.3f, 2.6f));
    }
}
