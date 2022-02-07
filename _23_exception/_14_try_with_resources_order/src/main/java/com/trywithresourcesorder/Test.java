package com.trywithresourcesorder;

public class Test implements AutoCloseable {

    public void close() {
        System.out.println("C");
    }

    static class Nested implements AutoCloseable {
        public void close() {
            System.out.println("B");
        }
    }

    public static void main(String... __) {
        Test test = new Test();
        try(test; Nested nested = new Nested()) {
            System.out.println("A");
        } finally {
            System.out.println("D");
        }
    }
}
