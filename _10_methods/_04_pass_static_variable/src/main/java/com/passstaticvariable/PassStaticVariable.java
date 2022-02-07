package com.passstaticvariable;

/**
 * #20210911_0846_48/1
 */
public class PassStaticVariable {

    private static int x;
    private static String s = "0";

    private int y;
    private static String z = "0";

    private static StringBuilder sb = new StringBuilder();
    private StringBuilder sb2 = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(x);
        PassStaticVariable p = new PassStaticVariable();

        // Примитивные типы при передаче в метод не изменяются
        test(x);
        System.out.println(x);

        test(s);
        System.out.println(s);

        test(p.y);
        System.out.println(p.y);

        test(p.z);
        System.out.println(p.z);

        // Ссылочные типы при передаче в метод изменяются
        p.test(sb);
        System.out.println(sb);

        p.test(p.sb2);
        System.out.println(p.sb2);
    }

    private static void test(int x) {
        x = 1;
    }

    private static void test(String x) {
        x = "1";
    }

    private void test(StringBuilder x) {
        x.append("1");
    }
}
