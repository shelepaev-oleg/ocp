package com.stringBuilderTest;

/**
 * #20210907_0645_14/4
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        var sb = new StringBuilder("0123");
        sb.insert(4, "4");
        System.out.println(sb);

        sb = new StringBuilder("0123");
        sb.delete(4, 4);
        System.out.println(sb);

        sb = new StringBuilder("0123");
        sb.substring(3);
        System.out.println(sb);

        var sb2 = new StringBuilder("012");
//        sb2.insert(4, "4"); //StringIndexOutOfBoundsException
        System.out.println(sb2);
    }
}
