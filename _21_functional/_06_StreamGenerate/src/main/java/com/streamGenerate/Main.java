package com.streamGenerate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Ок
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.iterate("", x -> x + "growl!");
        Stream<String> stream2 = Stream.iterate("", x -> x + "growl!");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);

        // Будет выполнять бесконечно
//        Predicate<? super String> predicate = s -> s.startsWith("g");
//        Stream<String> stream1 = Stream.generate(() -> "growl! ");
//        Stream<String> stream2 = Stream.generate(() -> "growl! ");
//        boolean b1 = stream1.anyMatch(predicate);
//        boolean b2 = stream2.allMatch(predicate);
//        System.out.println(b1 + " " + b2);
    }
}
