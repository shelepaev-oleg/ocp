package com.optionalAndFlatMap;

import java.util.Objects;
import java.util.Optional;

/**
 * #20210221_1520_275
 */
public class Main {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("string");

        // does not compile
//        Optional<Integer> result = optional.map(ChainingOptionals::calculator);

        // ok
        Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
        result.ifPresent(System.out::println);
    }
}

class ChainingOptionals {

    public static Optional<Integer> calculator(String s) {
        if (Objects.nonNull(s)) {
            return Optional.of(s.length());
        } else {
            return Optional.empty();
        }
    }
}
