package com.forRules;

public class ForRules {

    private static void print1(int[] weather) {
        for(int i = weather.length-1; i>=0; i--) {
            System.out.println(weather[i]);
        }
    }

    private static void print2(int[] weather) {
        for( var w : weather) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2};
        print1(values);
        print2(values);
    }
}
