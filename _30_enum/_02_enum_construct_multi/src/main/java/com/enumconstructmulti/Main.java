package com.enumconstructmulti;

public class Main {

    public static void main(String... __) {
    }
}

/**
 * enum может иметь несколько конструкторов
 */
enum Test {
    SUMMER(1),
    WINTER;

    public int days;

    Test() {}
    Test(int days) {
        this.days = days;
    }
}
