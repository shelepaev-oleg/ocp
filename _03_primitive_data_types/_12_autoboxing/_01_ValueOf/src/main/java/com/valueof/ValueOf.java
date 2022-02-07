package com.valueof;

import java.util.ArrayList;
import java.util.List;

/**
 * #20210908_0749_8/1
 */
public class ValueOf {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age); // NPE
    }
}
