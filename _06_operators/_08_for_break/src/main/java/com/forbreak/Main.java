package com.forbreak;

public class Main {

    public static void main(String... __) {
        int arr [] = {1, 2, 3};
        for (int el : arr) {
            if (el % 2 == 0)
                break;
            else
                continue;
//            int i = 0; // недостижимое выражение
        }
    }
}
