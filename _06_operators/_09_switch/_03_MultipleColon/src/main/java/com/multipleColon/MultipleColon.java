package com.multipleColon;

import java.time.DayOfWeek;

public class MultipleColon {

    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
//            case 'B': 'C': System.out.print("great "); // не компилируется
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
    }
}
