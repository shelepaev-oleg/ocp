package com.wildcardTest;

/**
 * #20210125_0815_213
 */
public class Main {

    public static void main(String[] args) {
        Integer [] iNums = {1, 2, 3};
        Stats<Integer> iStats = new Stats<>(iNums);
        System.out.println(iStats.average());

        Integer [] iNums2 = {3, 4, 5};
        Stats<Integer> iStats2 = new Stats<>(iNums2);
        System.out.println(iStats.sameAvg(iStats2));

        Float [] fNums = {1f, 2f, 3f};
        Stats<Float> iStats3 = new Stats<>(fNums);

//        System.out.println(iStats.sameAvg(iStats3)); // does not compile

        System.out.println(iStats.sameAvg2(iStats3));
    }
}
