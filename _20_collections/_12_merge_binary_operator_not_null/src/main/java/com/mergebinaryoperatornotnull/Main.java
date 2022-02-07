package com.mergebinaryoperatornotnull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String... __) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");

        BinaryOperator<String> op = (s1, s2) -> s1 + s2;

        map.merge("key", "value2", op);
        System.out.println(map);
    }
}
