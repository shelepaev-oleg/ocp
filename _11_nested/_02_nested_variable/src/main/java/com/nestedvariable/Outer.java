package com.nestedvariable;

/**
 * #20211020_0733_78/8
 */
public class Outer {

    int i = 0;

    static class Inner1 {
        static int i = 0;
    }

    class Inner2 {
        static final int i = 0; // static переменные Inner-классов должны быть помечены как final
//        static int j = 0; // does not compile
    }

    static class Inner3 {
        int i = 0;
    }

    public static void main(String... __) {
	// write your code here
    }
}
