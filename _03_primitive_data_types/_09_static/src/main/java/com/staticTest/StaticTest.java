package com.staticTest;

/**
 * #20210813_0801_4/6
 */
public class StaticTest {

    static int j;
    int k;

    // instance initializer block
    {
        int i = 0;
        j = 1;
        k = 2;
    }

    public static void main(String[] args) {
//        System.out.println(i); // cannot compile
        System.out.println(j);
//        System.out.println(k); // cannot compile
    }

    public void test() {
//        System.out.println(i); // cannot compile
        System.out.println(j);
        System.out.println(k);
    }
}
