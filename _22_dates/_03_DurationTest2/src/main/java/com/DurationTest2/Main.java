package com.DurationTest2;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * #20210320_0753_290
 */
public class Main {

    public static void main(String[] args) {
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2 = Duration.ofMinutes(1).toString();
        String s = Duration.of(60, ChronoUnit.SECONDS).toString();

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(s));
    }
}
