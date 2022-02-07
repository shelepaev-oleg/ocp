package com.defaultValues2;

/**
 * #20210811_0759_6/1
 */
public class WaterBottle {

    private String str;
    private boolean bool;
    public static float flo;
    public static int num;
    public static double dub;

    public static void main(String[] args) {
        // instance и static переменные имеют значение по умолчанию
        WaterBottle wb = new WaterBottle();
        System.out.println("Boolean = " + wb.bool);
        System.out.println("String = " + wb.str);
        System.out.println("Float = " + flo);
        System.out.println("Integer = " + num);
        System.out.println("Double = " + dub);

        // local переменная не имеет значения по умолчанию
        String str;
        boolean bool;
        float flo = 0.0f;
        int num;
        double dub = 0.0;
//        System.out.println("Boolean = " + bool); // не компилируется
//        System.out.println("String = " + str); // не компилируется
//        System.out.println("Float = " + flo); // не компилируется
//        System.out.println("Integer = " + num); // не компилируется
//        System.out.println("Double = " + dub); // не компилируется
    }
}
