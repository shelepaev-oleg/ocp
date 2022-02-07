package com.numericPromotion;

/**
 * #20210818_0728_19
 *
 * Особенности Numeric Promotion для унарных операторов.
 */
public class NumericPromotion {

    public static void main(String[] args) {
        byte b = 1;
//        short s = -b; // do not compile, т.к. будет преобразовываться в int
//        short s = --b; // ok, т.к. декремент, а не унарный оператор
        int s = -b;      // ok
//        long s = -b;     // ok
//        float s = -b;    // ok
//        double s = -b;   // ok

        final byte b2 = 1; // ok, т.к. final
        short s2 = -b2;
        System.out.println(s2);

        final Byte B = 1;
//        short s3 = -B; // do not compile, т.к. будет преобразовываться в int

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        byte b3 = 100 - 100;
        System.out.println(b3);

        float f = 1.0f;
        double d = 1.0;
//        int i = -f;  // do not compile, т.к. будет преобразовываться в float
//        float f2 = f + d;  // do not compile, т.к. будет преобразовываться в более длинный тип (double)
    }
}
