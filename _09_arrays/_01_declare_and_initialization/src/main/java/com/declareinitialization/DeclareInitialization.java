package com.declareinitialization;

/**
 * #20210907_0727_36/1
 */
public class DeclareInitialization {

    static int[] arr3;

    public static void main(String[] args) {
        // 1.
        int[] arr1 = new int[0];
        int[] arr2;
        System.out.println(arr1.length);
//        System.out.println(arr2.length); // error compile
//        System.out.println(arr3.length);

        // 2.
//        int[] arr4 = new int[];  // error compile
        int [][] arr5 = new int[0][];

        // 5
        int ids[], types;
        types = 0;
        int [] ids2, types2; // types2 - массив

        int [] s1;
//        int[2] s2;  // error compile
        int[] s2 = new int[2];  // error compile
//        int[] s3 = new int[2] {1, 2};  // error compile
        int[] s4 = new int[] {1, 2};  // error compile
    }
}
