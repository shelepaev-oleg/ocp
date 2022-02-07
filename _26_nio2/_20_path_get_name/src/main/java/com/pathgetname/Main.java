package com.pathgetname;

import java.nio.file.Path;

/**
 * .. выводится как каталог
 */
public class Main {

    public static void main(String... __) {
        Path path = Path.of("..", "/", "dir");
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }
    }
}
