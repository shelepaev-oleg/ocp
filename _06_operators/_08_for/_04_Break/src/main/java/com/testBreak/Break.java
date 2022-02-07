package com.testBreak;

/**
 * #20210831_0750_28/1
 */
public class Break {

    public static void main(String[] args) {
        // break позволяет выйти из цикла for
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int q = wolf.length;
        for( ; ; ) {
            System.out.print(wolf[--q]);
            if (q==0) break;
        }

        boolean b = true;
//        if (b) break; // error compile
        System.out.println(b);
    }
}
