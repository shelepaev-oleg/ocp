package com.OverflowingNumbers;

public class OverflowingNumbers {

    public static void main(String[] args) {
        System.out.println(test(100));
        System.out.println(test(2_000_000));
        System.out.println(test(Integer.MAX_VALUE));
    }

    private static boolean test(int i) {
        String newLine = "END OF FILE";
        int newLineSize = newLine.length();
        return i + newLineSize < 1_000_000;
    }
}
