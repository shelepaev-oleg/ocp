package com.switchDefault;

/**
 * #20210902_0815_24/2
 */
public class SwitchDefault {

    public static void main(String[] args) {
        String instrument = "violin";
        int p = -1;
        switch (instrument) {
            case "bass":
                p++;
                break;
            default:
                p++;
            case "VIOLIN":
                p++;
            case "viola":
                ++p;
                break;
        }
        System.out.print(p);
    }
}
