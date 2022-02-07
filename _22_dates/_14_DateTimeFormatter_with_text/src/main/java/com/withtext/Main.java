package com.withtext;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String... __) {
        System.out.println(DateTimeFormatter.ofPattern("hh 'oclock'").format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ofPattern("hh 'o''clock' a, zzzz").format(ZonedDateTime.now()));
    }
}
