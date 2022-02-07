package com.issamefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20211209_0716_385
 */
public class Main {

    public static void main(String... __) throws IOException {
        Path path1 = Paths.get("C:/root");
        Path path2 = Paths.get("C:/root");
        System.out.println(Files.isSameFile(path1, path2)); // true

        path1 = Paths.get("root");
        path2 = Paths.get("root");
        System.out.println(Files.isSameFile(path1, path2)); // true

        path1 = Paths.get("C:/root");
        path2 = Paths.get("root");
        System.out.println(Files.isSameFile(path1, path2)); // NoSuchFileException
    }
}
