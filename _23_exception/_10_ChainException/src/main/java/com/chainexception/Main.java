package com.chainexception;

public class Main {

    public static void main(String... __) {
        try {
            System.out.println(1);
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.println(2);
            throw new RuntimeException("2");
        } finally {
            System.out.println(3);
            throw new RuntimeException("3");
        }
    }
}
