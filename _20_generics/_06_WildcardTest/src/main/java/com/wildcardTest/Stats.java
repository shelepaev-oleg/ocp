package com.wildcardTest;

public class Stats<T extends Number> {
    T [] nums;
    Stats(T [] nums) {
        this.nums = nums;
    }
    double average() {
        double result = 0.0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i].doubleValue();
        }
        return result / nums.length;
    }
    boolean sameAvg(Stats<T> obj) {
        return average() == obj.average();
    }

    boolean sameAvg2(Stats<?> obj) {
        return average() == obj.average();
    }
}
