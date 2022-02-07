package com.reduceTest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
//                .parallelStream().parallel() // q1
//                .reduce(0,
//                        (c1, c2) -> c1 + c2.length(), // q2
//                        (s1, s2) -> s1 + s2)); // q3
//
//        System.out.println(Arrays.asList("w","o","l","f")
//                .parallelStream()
//                .reduce("X", String::concat));

//        System.out.println(Arrays.asList("w","o","l","f")
//                .stream()
//                .reduce("", (partialString, element) -> partialString + element));
//
//        System.out.println(Arrays.asList("w","o","l","f")
//                .parallelStream()
//                .reduce("", (partialString, element) -> partialString + element));

        System.out.println(Arrays.asList(1, 2, 3, 4)
                .parallelStream()
                .reduce(0, (a, b) -> a + b, Integer::sum));
    }
}
