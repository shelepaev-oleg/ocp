package com.switchRules2;

import java.time.DayOfWeek;

public class SwitchRules2 {

    public static void main(String[] args) {
    }

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
            default:
//            case 1:
//                continue; // не компилируется, т.к. continue не поддерживается
//            case thursday: // не компилируется, т.к. константной переменной должно быть присвоено значение
//                return DayOfWeek.THURSDAY;
            case 2:
                break;
//            case Sunday: // не компилируется, т.к. не константа
//                return DayOfWeek.SUNDAY;
//            case DayOfWeek.MONDAY: // не компилируется, т.к. не поддерживается тип
//                return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}
