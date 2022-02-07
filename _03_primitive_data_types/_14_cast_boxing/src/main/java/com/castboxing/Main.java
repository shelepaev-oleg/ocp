package com.castboxing;

/**
 * #java_202201301425
 */
public class Main {

    public static void main(String... __) {
        double d = 10;
        Float f1 = (float) d * 2;
        float f2 = (float) d * 2;
        double d1 = (float) d * 2;

        // boxing можно применять только к своему типу
        // Float f = 1L;
        // Double d2 = (float) d * 2;
    }
}
