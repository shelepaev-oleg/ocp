package com.byteTest;

/**
 * #20210824_0719_20/5
 */
public class ByteTest {

    public static void main(String[] args) {
        byte b = Byte.MAX_VALUE;
        System.out.println(b);                  // 127
        System.out.println((byte)(b + 1));      // -128
        System.out.println((byte)(b + 2));      // -127
        System.out.println((byte)(b + 129));    // 0
        System.out.println((byte)(b + 130));    // 1
    }
}
