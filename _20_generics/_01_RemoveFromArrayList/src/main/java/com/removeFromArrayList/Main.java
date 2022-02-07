package com.removeFromArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> r = new ArrayList<>();
        r.add("a");
        r.add("b");
        r.remove(1);

        List<String> l = Arrays.asList("a", "b");
        l.remove(1); // UnsupportedOperationException

        String[] array = { "gerbil", "mouse" }; // [gerbil, mouse]
        List<String> list = Arrays.asList(array); // returns fixed size list
        list.set(1, "test"); // [gerbil, test]
        array[0] = "new"; // [new, test]
//        String[] array2 = (String[]) list.toArray(); // [new, test]
        list.remove(1); // UnsupportedOperationException

    }
}
