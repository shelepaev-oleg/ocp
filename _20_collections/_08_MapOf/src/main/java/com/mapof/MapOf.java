package com.mapof;

import java.util.Map;

/**
 * #20211101_0737_87
 */
public class MapOf {

    public static void main(String[] args) {
        Map map = Map.of(1, 2, 3, 4);
        map.keySet().forEach(System.out::print);
        System.out.println();
        map.values().forEach(System.out::print);
    }
}
