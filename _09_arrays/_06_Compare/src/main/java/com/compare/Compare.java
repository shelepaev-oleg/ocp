package com.compare;

import java.util.Arrays;

/**
 * #20210908_1021_34/1
 */
public class Compare {

    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        System.out.println(Arrays.compare(s1, s2)); // 1

        Integer[] i1 = { null };
        Integer[] i2 = { null };
        System.out.println(Arrays.compare(i1, i2)); // 0

        Long[] l1 = { 1L, 2L };
        Long[] l2 = { 1L, 1L };
        System.out.println(Arrays.compare(l1, l2)); // 1
        System.out.println(Arrays.mismatch(l1, l2)); // 1
    }
}
