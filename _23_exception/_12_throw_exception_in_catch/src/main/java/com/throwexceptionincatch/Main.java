package com.throwexceptionincatch;

/**
 * #20211106_0828_408/4
 */
public class Main {

    public static void main(String... __) {
        try {
            System.out.println("1");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("2");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("3");
        }
    }
}
