package com.flatmapparallel;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * #20211204_0954_178/2
 */
public class Main {

    public static void main(String... __) {
        Stream<String> s1 = Stream.of("one", "two").parallel();
        Stream<String> s2 = Stream.of("three").parallel();
        Map<Boolean, List<String>> map = Stream.of(s1, s2).flatMap(s -> s)
                .collect(Collectors.groupingBy(s -> !s.startsWith("t")));
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
