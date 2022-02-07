package com.mergeComputeIfPresentComputeIfAbsent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * #20210204_0406_239
 */
public class Main {

    public static void main(String[] args) {
        // merge
        BiFunction<String, String, String> biF1 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> map1 = new HashMap<>();
        map1.put("Tom", "Bus Tour");
        map1.put("Jenny", "Tram");

        String t1 = map1.merge("Tom", "Skyride", biF1);
        String j1 = map1.merge("Jenny", "Skyride", biF1);
        String s1 = map1.merge("Sam", "Skyride", biF1);

        System.out.println(map1);
        System.out.println(t1);
        System.out.println(j1);
        System.out.println(s1);


        // computeIfAbsent
        Function<String, String> biF2 = v -> v;
        Map<String, String> map2 = new HashMap<>();
        map2.put("Tom", "Bus Tour");
        map2.put("Jenny", "Tram");

        String t2 = map2.computeIfAbsent("Tom", biF2);
        String j2 = map2.computeIfAbsent("Jenny", biF2);
        String s2 = map2.computeIfAbsent("Sam",  biF2);

        System.out.println(map2);
        System.out.println(t2);
        System.out.println(j2);
        System.out.println(s2);

        // computeIfAbsent
        BiFunction<String, String, String> biF3 = (k, v) -> v;
        Map<String, String> map3 = new HashMap<>();
        map3.put("Tom", "Bus Tour");
        map3.put("Jenny", "Tram");

        String t3 = map3.computeIfPresent("Tom", biF3);
        String j3 = map3.computeIfPresent("Jenny", biF3);
        String s3 = map3.computeIfPresent("Sam",  biF3);

        System.out.println(map3);
        System.out.println(t3);
        System.out.println(j3);
        System.out.println(s3);
    }
}
