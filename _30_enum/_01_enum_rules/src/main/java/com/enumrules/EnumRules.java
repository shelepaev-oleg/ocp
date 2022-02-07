package com.enumrules;

/**
 * #20211019_0659_325
 */
public class EnumRules {

    public static void main(String... __) {
        Test test = Test.valueOf("WINTER");
//        Test test2 = Test.valueOf("winter"); // IllegalArgumentException
    }
}

enum Test {
    WINTER("Low"),
    SPRING("High"),
    SUMMER("Medium"),
    AUTUMN("None");

    public String s;
    private Test(String s) {
        this.s = s;
    }
}
