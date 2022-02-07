package com.bitwise;

/**
 * #20210818_0822_20/1
 */
public class Bitwise {

    public static void main(String[] args) {
        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf=false);  // присваивание wolf = false вернет false
                                                // false ^ false вернет true
        System.out.println(canine+", "+teeth+", "+wolf); // true 20 false
    }
}
