package com.rabbit;

public class Main {

    public static void main(String... __) {

        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
            RABBIT: for(int col = 0; col <3 ; col++) {
                if((col + row) % 2 == 0)
//                    break; // ok
//                    continue BUNNY; // ok
//                    break RABBIT; // ok
                count++;
            }
        System.out.println(count);
    }
}
