package com.lambdarules;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * #20211024_0832_88/6
 */
public class Main {

    private int i = 1;
    private int z = 0;

    interface Formula {
        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }

    public static void main(String... __) {
        int i = 1;
        Main m = new Main();
        Callable<Boolean> c1 = () -> m.i == 1;
        Callable<Boolean> c2 = () -> i == 1;
        m.i = 2;
//        i = 2;

//        Formula formula = (a) -> sqrt(1);

        for (int j = 0; j < 5; j++) {
            int k = j;
            Supplier<Integer> s = () -> k;
//            Supplier<Integer> s = () -> j; // does not compile, т.к. не является effectively final
            System.out.println(s.get());
        }
    }

    void test(String p1, String p2) {
        String s1 = p1;
        String s2 = p2;

        s2 += "!";
        p2 += "!";

        Supplier<String> c = () -> s1;
    }

    // Имя метода и переменной может совпадать
    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }
    public void x(Consumer<String> x, Comparator<Boolean> y){}
}
