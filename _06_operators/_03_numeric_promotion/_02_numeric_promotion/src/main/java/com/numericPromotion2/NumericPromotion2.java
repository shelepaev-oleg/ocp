package com.numericPromotion2;

/**
 * #20210820_0749_20
 */
public class NumericPromotion2 {

    public static void main(String[] args) {
        short height = 1, weight = 3;
        short zebra = (short) ((byte) weight * (byte) height); // в этой строке происходит автоматическое преобразование в int
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);

        int i = 1;
        long l = i + 2L;

        float f = l + 2.2f;

        double d = i + 2.2;
    }
}
