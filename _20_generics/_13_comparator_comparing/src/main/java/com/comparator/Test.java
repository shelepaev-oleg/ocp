package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    String s;
    Integer i;

    public String getS() {
        return s;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                ", i=" + i +
                '}';
    }

    public Test(String s, Integer i) {
        this.s = s;
        this.i = i;
    }

    public static void main(String... __) {
        List<Test> list = new ArrayList<>();
        list.add(new Test("Paula", 3));
        list.add(new Test("Peter", 5));
        list.add(new Test("Peter", 7));

        Collections.sort(list, Comparator.comparing(Test::getS).thenComparing(Comparator.comparing(Test::getI)).reversed());
        System.out.println(list);
    }
}
