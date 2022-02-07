package com.castfunctionalinterface;

import java.util.Set;
import java.util.function.Supplier;

public class CastFunctionalInterface {

    public static void main(String[] args) {
        Supplier<Set<Double>> s1 = () -> Set.of(1.25);
//        Supplier<Set<Double>> s2 = () -> Set.of(1.25f); // не возможно закастить, т.к. уже задан дженерик
        Supplier<Set<Float>> s3 = () -> Set.of(1.25f);
    }
}
