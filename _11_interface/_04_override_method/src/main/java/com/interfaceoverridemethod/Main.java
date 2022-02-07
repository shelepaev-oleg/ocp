package com.interfaceoverridemethod;

/**
 * #20211020_0631_78/4/1
 */
public class Main implements Test1, Test2 {

    public void method() {
        System.out.println("Test1");
    }

    public static void main(String... __) {
	// write your code here
    }
}

interface Test1 {
    default void method() {
        System.out.println("Test1");
    }
}

interface Test2 {
    default void method() {
        System.out.println("Test2");
    }
}
