package com.computeabsentvalue;

import java.util.HashMap;
import java.util.Map;

/**
 * #java_202201301543
 */
public class Main {

    public static void main(String... __) {
        Map<String, String> map = new HashMap<>();
        map.compute("key", (key, oldValue) -> "Hi" + oldValue);
        System.out.println(map.get("key"));
    }
}
