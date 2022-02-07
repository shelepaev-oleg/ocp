package com.prepostincrement;

public class Main {

    public static void main(String... __) {
        int [] nums = { 1, 2, 3, 4, 5 };

        // ok
        for (var i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // ok
        for (var i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }

        for (var i = 0; i <= nums.length - 1; ++i) {
            System.out.println(nums[i]);
        }
    }
}
