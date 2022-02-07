package com.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * #20210309_0851_300
 */
public class Main {

    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");

        printProperties(us);
        System.out.println();
        printProperties(france);
    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}
