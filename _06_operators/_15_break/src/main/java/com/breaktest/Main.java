package com.breaktest;

public class Main {

    public static void main(String... __) {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int q = wolf.length;
        for( ; ; ) {
            System.out.print(wolf[--q]);
            if(q==0) break; // на if break не влияет
        }

        for( ; ; ) {
            System.out.print(wolf[--q]); // ArrayIndexOutOfBoundsException
            if(q==0) continue;
        }
    }
}
