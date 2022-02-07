package com.DateTimeFormatter_SHORT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * #20210319_0819_310
 */
public class Main {

    public static void main(String[] args) {
//        localDate();
//        localTime();
//        localDateTime();
        zonedDateTime();
    }

    private static void localDate() {
        LocalDate date = LocalDate.of(2015, 5, 10);

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("-----------------");

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL))); // UnsupportedTemporalTypeException

        System.out.println("-----------------");

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL))); // UnsupportedTemporalTypeException
    }

    private static void localTime() {
        LocalTime date = LocalTime.of(11, 22, 33);

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); // UnsupportedTemporalTypeException

        System.out.println("-----------------");

        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL))); // UnsupportedTemporalTypeException

        System.out.println("-----------------");

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG))); // UnsupportedTemporalTypeException
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL))); // UnsupportedTemporalTypeException
    }

    private static void localDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("-----------------");

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG))); // DateTimeException
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL))); // DateTimeException

        System.out.println("-----------------");

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG))); // DateTimeException
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL))); // DateTimeException
    }

    private static void zonedDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);

        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("-----------------");

        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG))); // DateTimeException
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL))); // DateTimeException

        System.out.println("-----------------");

        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG))); // DateTimeException
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL))); // DateTimeException
    }
}
