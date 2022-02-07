package com.optionalofnullablenull;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String... __) {
        // Optional.empty
        Stream.of(Optional.ofNullable(null)).findFirst().ifPresent(System.out::println);
    }
}
