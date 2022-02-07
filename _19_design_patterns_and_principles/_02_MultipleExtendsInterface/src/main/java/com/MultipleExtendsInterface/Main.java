package com.MultipleExtendsInterface;

/**
 * #20210331_0812_321
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface i1 {
    default void method() {
        System.out.println("1");
    }
}

interface i2 {
    default void method() {
        System.out.println("1");
    }
}

//interface i3 extends i1, i2 {
//}
