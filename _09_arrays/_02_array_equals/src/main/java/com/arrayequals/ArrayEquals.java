package com.arrayequals;

import java.util.ArrayList;

/**
 * #20210907_0805_36/1
 */
public class ArrayEquals {

    static int[] arr3;

    public static void main(String[] args) {
        int a1[] = {1};
        int a2[] = {1};
        System.out.println(a1.equals(a2)); // false

        ArrayList ar1 = new ArrayList();
        ar1.add(1);
        ArrayList ar2 = new ArrayList();
        ar2.add(1);
        System.out.println(ar1.equals(ar2)); // true
    }
}
