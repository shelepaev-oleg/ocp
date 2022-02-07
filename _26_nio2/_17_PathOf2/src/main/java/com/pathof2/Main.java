package com.pathof2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20211209_0804_376/1
 *
 * javac com/pathof2/Main.java
 * java com.pathof2/Main.java
 */
public class Main {

    public static void main(String... __) throws IOException {
        Path path = Paths.get("test.txt");
        System.out.println(path.toRealPath());

        path = Path.of("test.txt");
        System.out.println(path.toRealPath());
    }
}
