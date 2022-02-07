package com.decimalformat;

import java.text.DecimalFormat;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String... __) {
//        String pattern = "0,000.0#";
//        String pattern = "##.#";
//        String pattern = "#,###.0";
        String pattern = "#,###,000.0#";
        DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .forEach(System.out::println); // 005,21 008,49 1 234,0

        // 0 - печатает число, если числа нет, то печатает 0
        // # - печатает число, если числа нет, то ничего не печатает
        // . - разделитель между целой и дробной частями
        double d = 1.1;
        System.out.println(new DecimalFormat("#.##").format(d)); // 1,1
        System.out.println(new DecimalFormat("#.00").format(d)); // 1,10
//        System.out.println(new DecimalFormat("#.#0").format(d)); // Exception Malformed pattern "#.#0"

        // Rounding (округление)
        System.out.println(new DecimalFormat("#").format(d)); // 1

        // Grouping (группировка по разрядам)
        System.out.println(new DecimalFormat("#,###").format(d)); // 1

        long l1 = 123456789;
        System.out.println(new DecimalFormat(",###").format(l1)); // 123 456 789

        long l2 = 1;
        System.out.println(new DecimalFormat("0,000").format(l2)); // 0 001
    }
}
