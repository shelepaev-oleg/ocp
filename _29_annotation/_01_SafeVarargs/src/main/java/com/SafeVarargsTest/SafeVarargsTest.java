package com.SafeVarargsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #20210729_0716_455
 */
public class SafeVarargsTest {

    @SafeVarargs
    final int thisInUnsafe(List<Integer> ... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); // ClassCastException
    }

    public static void main(String[] args) {
        var carrot = new ArrayList<Integer>();
        new SafeVarargsTest().thisInUnsafe(carrot);
    }
}
