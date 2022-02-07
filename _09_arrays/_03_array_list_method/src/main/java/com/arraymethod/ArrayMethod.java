package com.arraymethod;

import java.util.ArrayList;

/**
 * #20210907_0823_36/1
 */
public class ArrayMethod {

    public static void main(String[] args) {
        var a = new ArrayList<Integer>();
        a.add(4);
        a.add(4);
        a.set(0, 6);
        System.out.println(a);
    }
}
