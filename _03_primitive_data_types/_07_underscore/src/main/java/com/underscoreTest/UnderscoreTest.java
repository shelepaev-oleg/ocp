package com.underscoreTest;

public class UnderscoreTest {

    public static void main(String[] args) {
        printMagic(1_1);
//        printMagic(1_.0); // does not compile
//        printMagic(1.0_); // does not compile
//        printMagic(1._0); // does not compile
        printMagic(1.0_0); // does not compile
        printMagic(1__1.0__0); // does not compile
//        printMagic(_1.0); // does not compile
    }

    private static void printMagic(final double d) {
        System.out.println(d);
    }
}
