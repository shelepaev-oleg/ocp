package com.prePostIncremenent;

/**
 * #20210902_0741_20/6
 */
public class PrePostIncremenent {

    public static void main(String[] args) {
        int i = 1;
        if (--i == 0) {
            System.out.println(i); // 0
        }
        int j = 1;
        if (j-- == 0) {
            System.out.println(j); // не выведется
        }

        long h2 = 12;
        if (h2-- % 12 == 0) {
            System.out.println(h2); // 11
        }
    }
}
