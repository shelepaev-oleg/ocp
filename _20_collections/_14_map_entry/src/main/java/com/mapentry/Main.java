package com.mapentry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * #java_2022_01_30_1606
 */
public class Main {

    public static void main(String... __) {
        Map<String, String> map = new HashMap<>();

        Set<Map.Entry<String, String>> set = map.entrySet();

        Map.Entry<String, String> entry = Map.entry("key", "value");
        set.add(entry);
    }
}
