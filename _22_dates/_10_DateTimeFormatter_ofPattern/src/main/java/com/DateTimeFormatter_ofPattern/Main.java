package com.DateTimeFormatter_ofPattern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 5);
        LocalTime time = LocalTime.of(7, 8, 9);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(DateTimeFormatter.ofPattern("MMMM").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("MMM").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("MM").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("M").format(dateTime));

        System.out.println(DateTimeFormatter.ofPattern("dd").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("d").format(dateTime));

        System.out.println(DateTimeFormatter.ofPattern("yyyy").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("yyy").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("yy").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("y").format(dateTime));

        System.out.println(DateTimeFormatter.ofPattern("hh").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("h").format(dateTime));

        System.out.println(DateTimeFormatter.ofPattern("mm").format(dateTime));
        System.out.println(DateTimeFormatter.ofPattern("m").format(dateTime));

        System.out.println(DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm").format(dateTime));
    }
}
