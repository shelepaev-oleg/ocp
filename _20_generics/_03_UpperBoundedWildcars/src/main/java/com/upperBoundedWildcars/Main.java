package com.upperBoundedWildcars;

import java.util.ArrayList;
import java.util.List;

/**
 * #20212001_0806_207
 * Upper-Bounded Wildcards
 * Нельзя записать в массив используя подстановочные знаки, можно только прочитать
 */
public class Main {

    public static void main(String[] args) {
//        List<? extends Bird> birds = new ArrayList<Bird>();
        List<? extends Bird> birds = new ArrayList<Sparrow>();
//        birds.add(new Sparrow()); // DOES NOT COMPILE
//        birds.add(new Bird()); // DOES NOT COMPILE
    }
}

class Sparrow extends Bird { }
class Bird { }
