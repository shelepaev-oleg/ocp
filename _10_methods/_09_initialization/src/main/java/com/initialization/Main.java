package com.initialization;

public class Main {

    static int i;
    int j;
    final String s = "0";

    static {
        i = 0;
//        j = 0; // does not compile
    }

    {
        i = 0;
        j = 0;
    }

    public static void main(String... __) {
    }
}
