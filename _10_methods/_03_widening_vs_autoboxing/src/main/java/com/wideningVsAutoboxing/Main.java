package com.wideningVsAutoboxing;

/**
 * #201218_0755
 * https://www.geeksforgeeks.org/method-overloading-autoboxing-widening-java/
 */
public class Main {

    void print(float x) {
        System.out.println("float");
    }

    void print(Long x) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.print(1L);
    }
}
