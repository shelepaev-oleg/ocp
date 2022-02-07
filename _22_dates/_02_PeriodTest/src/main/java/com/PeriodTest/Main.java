package com.PeriodTest;

import java.time.LocalTime;
import java.time.Period;

/**
 * #20210304_0819_290
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Period.of(1, 0, 0));
        System.out.println(Period.of(0, 1, 0));
        System.out.println(Period.of(0, 0, 1));
        System.out.println(Period.of(1, 1, 1));

        // 1. Неправильные способы работы с периодом
        Period wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(1);
        System.out.println(wrong);

        System.out.println(Period.ofYears(1).ofWeeks(1));

        // 2. Неправильные способы работы с периодом
        LocalTime time = LocalTime.of(6, 15);
        Period period = Period.ofMonths(1);
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
    }
}
