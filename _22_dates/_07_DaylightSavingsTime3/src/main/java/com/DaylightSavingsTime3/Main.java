package com.DaylightSavingsTime3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * #20210320_0730_294
 */
public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 59);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.MINUTES);

        // Эта разность в часах высчитывается по гринвичу, а у гринвича нет перевоада на летнее время
        long hours = ChronoUnit.MINUTES.between(dateTime1, dateTime2); // 1

        int clock1 = dateTime1.getHour(); // 1
        int clock2 = dateTime2.getHour(); // 3
        System.out.println(hours + "," + clock1 + "," + clock2);
    }
}
