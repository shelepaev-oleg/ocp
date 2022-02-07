package com.doubleVsFloat;

public class Adder {

    static int add(short a, short b) {
        System.out.println("short");
        return a + b;
    }

    static int add(byte a, byte b) {
        System.out.println("byte");
        return a + b;
    }

    static int add(int a, int b) {
        System.out.println("int");
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println("double");
        return a + b;
    }

//    Если закомментировать, то программа продолжит работать
    static float add(float a, float b) {
        System.out.println("float");
        return a + b;
    }
}
