package com.varargs;

public class Varargs {

    public static void main(String[] args) {
        test(1, 2);
//        test({1, 2}); // error compile
        test(new int[2]);
        test(new int[] {1, 2});
        test(null); // npe
    }

    private static void test (int ... s) {
        System.out.println(s.length);
    }
}
