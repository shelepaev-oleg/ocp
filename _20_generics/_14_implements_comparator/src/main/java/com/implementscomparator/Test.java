package com.implementscomparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }

    public static void main(String... __) {
        String [] arr = {"123", "abc"};
        Arrays.sort(arr, new Test());
        for (var a : arr) {
            System.out.println(a);
        }

        Test2 [] list = {new Test2("abc"), new Test2("123")};
        Arrays.sort(list);
        for (var a : list) {
            System.out.println(a);
        }

    }
}

class Test2 implements Comparable<Test2> {

    String s;

    Test2(String s) { this.s = s; }

    @Override
    public String toString() {
        return "Test2{" +
                "s='" + s + '\'' +
                '}';
    }

    @Override
    public int compareTo(Test2 o) {
        return s.toLowerCase().compareTo(o.s.toLowerCase());
    }
}
