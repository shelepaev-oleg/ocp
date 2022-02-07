package com.InstantTest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.ofEpochSecond(dateTime.toEpochSecond(ZoneOffset.UTC));
        System.out.println(instant);

        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015–05–26T15:55:00Z
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour); // 2015–05–25T16:55:00Z

//        System.out.println(instant.plus(1, ChronoUnit.WEEKS)); // exception
//        System.out.println(instant.plus(1, ChronoUnit.YEARS)); // exception
        System.out.println(instant.plus(1, ChronoUnit.MINUTES)); // exception

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plus(1, ChronoUnit.WEEKS));
    }
}
