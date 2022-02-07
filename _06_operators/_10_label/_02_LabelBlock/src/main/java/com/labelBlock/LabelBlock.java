package com.labelBlock;

/**
 * #20210830_0806_28/1
 */
public class LabelBlock {

    public static void main(String[] args) {
        // continue label до блока - error compile
        label: {
            for (int i = 0; i <= 3; i++) {
                if (i == 2) {
//                    continue label;
                }
                System.out.println(i);
            }
        }

        // break label - выходит из блока помеченного label
        label: {
            for (int i = 0; i <= 3; i++) {
                if (i == 2) {
                    break label;
                }
                System.out.println(i);
            }
        }
    }
}
