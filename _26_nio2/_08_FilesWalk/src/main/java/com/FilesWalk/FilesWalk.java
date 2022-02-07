package com.FilesWalk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * #20210514_0733_397
 */
public class FilesWalk {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Work\\_github\\ocp");
        try {
            Files.walk(path)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
