package com.partitioningByGroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * #20210223_1519
 */
public class Main {

    public static void main(String[] args) {
        Stream.of("I", "Love", "Stack Overflow")
                .collect(Collectors.partitioningBy(s -> s.length() > 0))
                .forEach((k, v) -> System.out.println(k + " => " + v));

        Stream.of("I", "Love", "Stack Overflow")
                .collect(Collectors.groupingBy(s -> s.length() > 0))
                .forEach((k, v) -> System.out.println(k + " => " + v));

        Map<Boolean, Long> c = Stream.of("I", "Love", "Stack Overflow")
                .collect(Collectors.partitioningBy(s -> s.length() > 0, Collectors.counting()));
        for(Map.Entry<Boolean, Long> item : c.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue());
        }

        // По умолчанию List
        Map<Boolean, List<String>> list = Stream.of("I", "Love", "Ann")
                .collect(Collectors.partitioningBy(s -> s.length() > 0));

        Map<Boolean, Set<String>> set = Stream.of("I", "Love", "Ann")
                .collect(Collectors.partitioningBy(s -> s.length() > 0, Collectors.toSet()));

        Map<Boolean, Map<String, Object>> map = Stream.of("I", "Love", "Ann")
                .collect(Collectors.partitioningBy(s -> s.length() > 0, Collectors.toMap(Function.identity(), String::valueOf)));

        List<Integer> l = Arrays.asList(1, 2);
        int[] arrayOK = l.stream().mapToInt(i -> i).toArray();

//        int[] arrayProblem = l.stream().mapToInt(Function.identity()).toArray();
    }
}
