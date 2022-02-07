package com.mergekeynotassociated;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String... __) {
        Map<String, String> map = new HashMap<>();
        BinaryOperator op = (s1, s2) -> null;
        map.merge("key", "value", op);
        System.out.println(map);
    }
}
