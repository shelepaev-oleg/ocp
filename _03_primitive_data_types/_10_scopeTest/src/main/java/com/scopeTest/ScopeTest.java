package com.scopeTest;

/**
 * #20210817_0756_446
 */
public class ScopeTest {

    {
        int hairs = 3_000_0;
    }

    long water, air = 2;
    boolean twoHumps = true;

    public void spit(float distance) {
        var var = 3_0_00.0;
        {
            double teeth = 32 + distance++;
        }
        while (water > 0) {
            int age = twoHumps ? 1 : 2;
            short i = -1;
            for (i = 0; i < 10; i++) {
                var Private = 2;
            }
            // В данной области видимости доступно 7 переменных
            // SCOPE
            System.out.println(water);
            System.out.println(air);
            System.out.println(twoHumps);
            System.out.println(distance);
            System.out.println(var);
            System.out.println(age);
            System.out.println(i);
        }
    }
}