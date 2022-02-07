package com.integerVsFloat;

import java.util.ArrayList;
import java.util.List;

/**
 * В коллециях могут использоваться только
 * https://stackoverflow.com/questions/2504959/why-can-java-collections-not-directly-store-primitives-types
 * https://codecooks.com/primitivs-vs-boxedprimitives-java/
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//         List<int> list = new ArrayList<>(); //ошибка комплиляции
    }
}
