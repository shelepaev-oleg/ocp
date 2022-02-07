package com.whileRules;

/**
 * #20210831_0814_28/2
 */
public class WhileRules {

    public static void main(String[] args) {
        double iguana = 0;
        int snake = 1; // ok
        do {
//            int snake = 1; // error compile
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.println(iguana);
    }
}
