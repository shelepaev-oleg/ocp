package com.parallelStreamTest;

import java.util.Arrays;

/**
 * 20210107_1436_178
 */
public class Main {

    public static void main(String[] args) {
        // недетерминировано, т.к. findAny возвращает любой элемент
        Integer i1 = Arrays.asList(6,7,8,9,10)
                .parallelStream()
                .sorted()
                .findAny().get();
        System.out.println(i1); // недетерминировано, каждый раз будет разный результат

        // детерминировано
        Integer i2 = Arrays.asList(6,7,8,9,10)
                .parallelStream()
                .sorted()
                .findFirst().get();
        System.out.println(i2); // 6

        // детерминировано
        Integer i3 = Arrays.asList(6,7,8,9,10)
                .stream()
                .parallel()
                .sorted()
                .findFirst().get();
        System.out.println(i3); // 6
    }
}
