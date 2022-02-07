package com.datetimeformatterlocaldata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * #20211119_0721_286/1
 */
public class Main {

    public static void main(String... __) {
        LocalDateTime.parse("2021-11-19T07:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        LocalDateTime.parse("2021-11-19T07:15", DateTimeFormatter.ISO_LOCAL_DATE); // DateTimeParseException

        LocalDate.parse("2021-11-19", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate.parse("2021-11-19", DateTimeFormatter.ISO_LOCAL_DATE_TIME); // DateTimeParseException
    }
}
