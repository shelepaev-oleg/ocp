package com.removingConditionally;

import java.util.ArrayList;
import java.util.List;

/**
 * #20210202_0721_236
 */
public class Main {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Magician", "Assistant");
//        System.out.println(list); // [Magician, Assistant]
//        list.removeIf(s -> s.startsWith("A")); // UnsupportedOperationException
//        System.out.println(list); // [Magician]

        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]
    }
}
