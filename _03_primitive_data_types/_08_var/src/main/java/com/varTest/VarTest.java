package com.varTest;

import java.util.function.Predicate;

/**
 * #20210813_0734_6/6
 */
public class VarTest {

//    var i = 0; // cannot compile

    static {
        var k = 0;
    }

    public static void main(String[] args) {
        var j = 0;

        final var z = 1;

        int n = 0, m = 1;
//        var k = 0, l = 1; // cannot compile

        var result = new VarTest().test((var var) -> var == true, true);
        System.out.println(result);

        var var = new VarTest().test((var v) -> v == true, true);
        System.out.println(var);
    }

    boolean test(Predicate<Boolean> p, boolean v) {
        return p.test(v);
    }
}
