package com.comparatortest;

import java.util.Comparator;

/**
 * #20210910_0838_255
 */
public class ComparatorTest {

    public static void main(String[] args) {
        Comparator<Integer> c1 = (i, j) -> Integer.compare(i, j);
        Comparator<Integer> c2 = Integer::compare;
        System.out.println(c1.compare(1, 2));
        System.out.println(c1.compare(1, 1));
        System.out.println(c2.compare(1000, 1));
//        System.out.println(c2.compare(null, 1)); // NPE
        System.out.println(c2.compare(1, null)); // NPE
    }
}
