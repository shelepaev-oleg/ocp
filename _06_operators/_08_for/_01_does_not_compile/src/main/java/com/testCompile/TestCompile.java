package com.testCompile;

import java.util.ArrayList;
import java.util.List;

/**
 * #20210827_0659_28
 */
public class TestCompile {

    public static void main(String[] args) {
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }
        for (int b : myFavoriteNumbers) {
            continue;
//            System.out.print(b + ", "); // ошибка компиляции
        }
        for (int i= 0; i < myFavoriteNumbers.size(); i ++) {
            continue;
//            System.out.println('!');  // ошибка компиляции
        }
        for (Object c : myFavoriteNumbers)
            System.out.print(c + ", ");
    }
}
