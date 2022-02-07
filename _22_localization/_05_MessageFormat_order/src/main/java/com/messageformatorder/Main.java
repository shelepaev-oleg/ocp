package com.messageformatorder;

import java.text.MessageFormat;

/**
 * MessageFormat не требовательный к порядку в шаблоне.
 * Индексация в шаблоне должна начинаться с 0.
 */
public class Main {

    public static void main(String... __) {
        String pattern = "{1} {0}";
        String res = MessageFormat.format(pattern, "2", "1");
        System.out.println(res); // 1 2
    }
}
