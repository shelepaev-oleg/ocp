package com.NumberFormatTest;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        double price = 48;
        NumberFormat us = NumberFormat.getCurrencyInstance();
        System.out.println(us.format(price));
    }
}
