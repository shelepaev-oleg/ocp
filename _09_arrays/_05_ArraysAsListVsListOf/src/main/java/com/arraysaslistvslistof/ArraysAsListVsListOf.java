package com.arraysaslistvslistof;

import java.util.Arrays;
import java.util.List;

/**
 * #20210908_0916_36/7
 */
public class ArraysAsListVsListOf {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, null);
        list1.set(1, 10); // OK

        List<Integer> list2 = List.of(1, 2, 3);
        list2.set(1, 10); // Fails with UnsupportedOperationException
    }
}
