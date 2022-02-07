package com.defaultmethod;

/**
 * #20210924_0814_78/3
 */
interface Operator {
    int operate(int n);
    default int inverse(int n) {
        return -n;
    }
}

public class Test {

    public static int apply(int n, Operator operator) {
        return operator.inverse(n);
    }

    public static void main(String... __) {
        System.out.println(apply(3, n -> n));
    }
}
