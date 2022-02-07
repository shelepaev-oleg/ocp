package com.joiningTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Выведет 12345
        System.out.println(
            Stream.iterate(1, x -> ++x)
                    .limit(5)
                    .map(x -> "" + x)
                    .collect(Collectors.joining(""))
        );

        // Подстановочные знаки
        // 123 -> $$123
        // 1   -> $$$$1
        System.out.println(fillSymbol(123));
        System.out.println(fillSymbol(1));
    }

    private static String fillSymbol(int i) {
        List<String> list = Arrays.asList(String.valueOf(i).split(""));
        Collections.reverse(list);
        String str = Stream.concat(list.stream(), Stream.of("$", "$", "$", "$", "$"))
                .limit(5)
                .collect(Collectors.joining(""));
        return new StringBuilder(str).reverse().toString();
    }
}
