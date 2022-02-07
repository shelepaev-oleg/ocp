package com.hangs;

import java.util.stream.Stream;

/**
 * #20211115_0808_260/1
 */
public class Main {

    public static void main(String... __) {
//        allMatchHangs(); // hangs
        allMatch(); // false

//        noneMatchHangs(); // hangs
        noneMatch(); // false

//        anyMatchHangs(); // hangs
        anyMatch(); // true
    }

    static void allMatchHangs() {
        Stream<Boolean> stream = Stream.generate(() -> true);
        System.out.println(stream.allMatch(item -> item == true));
    }

    static void allMatch() {
        Stream<Boolean> stream = Stream.generate(() -> true);
        System.out.println(stream.allMatch(item -> item == false));
    }

    static void noneMatchHangs() {
        Stream<Boolean> stream = Stream.generate(() -> false);
        System.out.println(stream.noneMatch(item -> item == true));
    }

    static void noneMatch() {
        Stream<Boolean> stream = Stream.generate(() -> false);
        System.out.println(stream.noneMatch(item -> item == false));
    }

    static void anyMatchHangs() {
        Stream<Boolean> stream = Stream.generate(() -> false);
        System.out.println(stream.anyMatch(item -> item == true));
    }

    static void anyMatch() {
        Stream<Boolean> stream = Stream.generate(() -> false);
        System.out.println(stream.anyMatch(item -> item == false));
    }
}
