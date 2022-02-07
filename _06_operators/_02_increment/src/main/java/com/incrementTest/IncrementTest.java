package com.incrementTest;

/**
 * #20210818_0709_18
 */
public class IncrementTest {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);

        int j = 1;
        j = ++j;
        System.out.println(j);

        int a = 2;
        int b = 5;
        int c = a * (a++ - --b) * a * b;
        System.out.println(String.format("a = %s, b = %s, c = %s", a, b, c));

        Integer x = 1;
        Integer y = x;
        x++;
        System.out.println(x + " " + y);
    }
}
