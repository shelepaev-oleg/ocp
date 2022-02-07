package com.peek;

import java.util.stream.Stream;

public class Main {

    public static void main(String... __) {
        // peek не будет выполняться, если нет терминалой операции
        Stream.generate(() -> "1")
                .peek(System.out::println)
                .limit(2);

        Stream.generate(() -> "1")
                .peek(x -> System.out.println("1"))
                .limit(2)
                .forEach(x -> System.out.println("2"));
    }
}
