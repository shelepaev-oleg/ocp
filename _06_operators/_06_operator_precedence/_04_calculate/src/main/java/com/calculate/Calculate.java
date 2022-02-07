package com.calculate;

/**
 * #20210826_0707_20/6
 */
public class Calculate {

    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println(i); //2
        System.out.println(j); //1

        int ph = 7, vis = 2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2);
        boolean safe = (vis > 2) && (ph++ > 1); // в данном выражении правая часть не высчитывается, т.к. при расчете левой сразу становится понятно, что false и java дальше не идет
        boolean tasty = 7 <= --ph;
        System.out.println(clear+"-"+safe+"-"+tasty);
    }
}
