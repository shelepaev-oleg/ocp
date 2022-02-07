package com.filedelete;

import java.io.File;

public class Main {

    public static void main(String... __) {
        File file = new File("/не_существующий_путь");
        System.out.println(file.delete());
    }
}
