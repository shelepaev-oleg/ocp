package com.equalstest;

public class Main {

    public static void main(String... __) {
        String s = "123";
        System.out.println(s == "123"); // true
        s += "4";
        System.out.println(s == "1234");
    }
}
