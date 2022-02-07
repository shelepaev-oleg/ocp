package com.overloadedvarargs;

/**
 * varargs и массив компилятор считает одним и тем же
 */
public class Main {

    public static void main(String... __) {
    }

    void method (Object...args) {
    }

    // error
//    void method (Object[] args) {
//    }
}


