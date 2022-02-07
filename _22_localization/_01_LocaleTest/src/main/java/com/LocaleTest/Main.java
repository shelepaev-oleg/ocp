package com.LocaleTest;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale l1 = new Locale("hi");
        System.out.println(l1.getLanguage());
        System.out.println(l1.getCountry());
        Locale l2 = new Locale("hi", "IN");
        System.out.println(l2.getLanguage());
        System.out.println(l2.getCountry());
        Locale l3 = new Locale("IN");
        System.out.println(l3.getLanguage());
        System.out.println(l3.getCountry());

        System.out.println("-------------");

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale g = Locale.GERMAN;
        Locale g2 = Locale.GERMANY;
        System.out.println(g); // de
        System.out.println(g2); // de_DE

        Locale l4 = new Locale.Builder() // bad but legal
                .setRegion("us")
                .setLanguage("EN")
                .build();
        System.out.println(l4);
    }
}
