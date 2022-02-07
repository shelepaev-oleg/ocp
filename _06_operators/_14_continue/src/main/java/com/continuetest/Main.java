package com.continuetest;

import java.util.Arrays;
import java.util.List;

/**
 * #20211030_1021_28/2
 */
public class Main {

    public static void main(String... __) {
        List<Integer> list = Arrays.asList(1, 2);
        for (var i : list) {
            System.out.println(i);
            continue;
        }

        for (var i : list) {
            continue;
//            System.out.println(i); // does not compile
        }

        for (var i : list) {
            break;
//            System.out.println(i); // does not compile
        }
    }
}
