package com.ChronoUnitTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // PT12H
        System.out.println(Duration.of(1, ChronoUnit.HALF_DAYS));

        // Вычисление разницы
        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
    }
}
