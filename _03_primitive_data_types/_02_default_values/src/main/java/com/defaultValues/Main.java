package com.defaultValues;

/**
 * #20201223_0746
 *
 * По умолчанию инициализируются: static variable и instance variable
 * По умолчанию не инициализируется: local variable
 */
public class Main {

    // static variable
    static int i;

    // instance variable
    int y;

    public static void main(String[] args) {
        // local variable
        int p;

        System.out.println(i);
        System.out.println(new Main().y);

        // Error compile:
//        System.out.println(new Main().p);   // Cannot resolve symbol 'p'
//        System.out.println(p);              // Variable 'p' might not have been initialized

        p = 1;
        System.out.println(p);
    }
}
