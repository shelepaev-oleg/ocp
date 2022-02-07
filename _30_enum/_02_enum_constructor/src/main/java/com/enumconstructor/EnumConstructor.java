package com.enumconstructor;

/**
 * #20211019_0724_326
 */
public class EnumConstructor {

    public static void main(String... __) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        System.out.print("end");
    }
}

enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}
