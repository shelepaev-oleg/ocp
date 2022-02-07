package com.systemexit;

public class SystemExit {

    public static void main(String... __) {
        try {
            System.exit(0);
        } finally {
            System.out.println("!");
        }
    }
}
