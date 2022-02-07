package com.ZoneIdTest;

import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("Moskow"))
                .sorted().forEach(System.out::println);
    }
}
