package com.labelFor;

/**
 * #20210830_0759_28/1
 */
public class LabelFor {

    public static void main(String[] args) {
//        // continue
//        for (int i = 0; i <= 10; i++) {
//            if (i > 4 && i < 9) {
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        // continue nested
//        for (int j = 0; j <= 10; j++) {
//            for (int i = 0; i <= 10; i++) {
//                if (i > 4 && i < 9) {
//                    continue;
//                }
//                System.out.println(String.format("i = %d, j = %d", i, j));
//            }
//        }
//
//        // continue nested - continue выходит только из внутреннего цикла
//        for (int j = 0; j <= 3; j++) {
//            for (int i = 0; i <= 3; i++) {
//                if (i == 2) {
//                    continue;
//                }
//                System.out.println(String.format("i = %d, j = %d", i, j));
//            }
//        }
//
//        // continue label - выходит из любого числа циклов, но до метки
        label: for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
                if (i == 2) {
                    continue label;
                }
                System.out.println(String.format("i = %d, j = %d", i, j));
            }
        }

        // break label - выходит из блока помеченного label
        label: for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
                if (i == 2) {
                    break label;
                }
                System.out.println(String.format("i = %d, j = %d", i, j));
            }
        }
    }
}
