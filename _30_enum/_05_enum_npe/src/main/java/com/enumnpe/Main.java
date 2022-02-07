package com.enumnpe;

/**
 * #20211021_0641_327
 */
public class Main {

    enum Time {
        WINTER, SUMMER
    }

    public static void main(String... __) {
        Time time = null;
        switch (time) { // NPE
            case SUMMER:
                break;
            case WINTER:
        }
    }
}
