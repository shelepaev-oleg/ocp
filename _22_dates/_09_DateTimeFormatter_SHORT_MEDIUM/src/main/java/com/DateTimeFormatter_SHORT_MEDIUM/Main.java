package com.DateTimeFormatter_SHORT_MEDIUM;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * #20210316_0804_310
 */
public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zoneId);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter longF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter fullF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        // SHORT
//        System.out.println(shortF.format(date)); // UnsupportedTemporalTypeException: Unsupported field: HourOfDay
//        System.out.println(shortF.format(time)); // UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
        System.out.println(shortF.format(dateTime)); // OK 20.01.2020, 11:12
        System.out.println(shortF.format(zonedDateTime)); // OK 20.01.2020, 11:12

        // MEDIUM
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date)); // UnsupportedTemporalTypeException: Unsupported field: HourOfDay
//        System.out.println(mediumF.format(time)); // UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
        System.out.println(mediumF.format(dateTime)); // OK 20 янв. 2020 г., 11:12:34
        System.out.println(mediumF.format(zonedDateTime)); // OK 20 янв. 2020 г., 11:12:34

        // LONG
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date)); // UnsupportedTemporalTypeException: Unsupported field: HourOfDay
//        System.out.println(longF.format(time)); // UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
//        System.out.println(longF.format(dateTime)); // DateTimeException: Unable to extract ZoneId from temporal 2020-01-20T11:12:34
        System.out.println(longF.format(zonedDateTime)); // OK 20 янв. 2020 г., 11:12:34

        // FULL
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date)); // UnsupportedTemporalTypeException: Unsupported field: HourOfDay
//        System.out.println(fullF.format(time)); // UnsupportedTemporalTypeException: Unsupported field: DayOfMonth
//        System.out.println(fullF.format(dateTime)); // DateTimeException: Unable to extract ZoneId from temporal 2020-01-20T11:12:34
        System.out.println(fullF.format(zonedDateTime)); // OK понедельник, 20 января 2020 г., 11:12:34 Екатеринбург, стандартное время
    }
}
