package com.genereicsMethod;

import java.util.Arrays;
import java.util.List;

/**
 * #20210123_0725_210
 */
public class Main {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Test1", "Test2");
        String s = method1(list1);
        System.out.println(s);

        List<Integer> list2 = Arrays.asList(1, 2);
        Integer i = method1(list2);
        System.out.println(i);
    }

    private static <T> T method1(List<? extends T> list) {
        return list.get(0);
    }
}
