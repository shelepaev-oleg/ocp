package com.prePost;

/**
 * #20210827_0728_27
 */
public class PrePost {

    public static void main(String[] args) {
        String[] values = {"one", "two", "three"};
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        for (int i = 0; i < values.length; ++i) {
            System.out.println(values[i]);
        }
    }
}
