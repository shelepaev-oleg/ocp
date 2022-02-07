package com.assigment;

/**
 * #20210820_0709_20/4
 */
public class Assigment {

    public static void main(String[] args) {
        int i = 2;
        i += 1.0;
        System.out.println(i); // 3

        int pig = (short)4;
        pig = pig++; // 4
        long goat = (int)2; //2
        goat -= 1.0; // 1, автоматический cast
        System.out.print(pig + " - " + goat); // 4 - 1
    }
}
