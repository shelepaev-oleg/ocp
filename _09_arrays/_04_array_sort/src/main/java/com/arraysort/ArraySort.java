package com.arraysort;

import java.util.Arrays;
import java.util.Collections;

/**
 * #20210907_0917_36/4
 */
public class ArraySort {

    public static void main(String[] args) {
        var arr = Arrays.asList(1, 0, 2);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println("-------------------------------------------------------------");

        int arr2[] = {1, 3, 4};
        Arrays.sort(arr2);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 3)); // 1
        System.out.println(Arrays.binarySearch(arr2, 8)); // -4
        System.out.println(Arrays.binarySearch(arr2, 0)); // -1
        System.out.println(Arrays.binarySearch(arr2, 2)); // -2
    }
}
