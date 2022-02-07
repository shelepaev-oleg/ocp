package com.numberformatexception;

/**
 * #20211001_0711_408/2
 */
public class Main {

    public static void main(String... __) {
        String s = "s";
        try {
            Integer i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        String n = null;
        try {
            int i = Integer.parseInt(n);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
