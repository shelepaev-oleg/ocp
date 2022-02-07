package com.compareto;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * #20211101_0658_87
 */
public class Main {

    public static void main(String... __) {
        List<String> list = Arrays.asList("a", "A");
        list.sort((c1, c2) -> c1.compareTo(c2));
        System.out.println(list);

        Set<String> set = Set.of("a", "A");
//        set.sort((c1, c2) -> c1.compareTo(c2));
    }
}
