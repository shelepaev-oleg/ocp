package com.stringbuilderdelete;

/**
 * #20210907_0653_14/4
 */
public class StringBuilderDelete {

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("012345");
        b.delete(3, 5);
        System.out.println(b); // 0125
    }
}
