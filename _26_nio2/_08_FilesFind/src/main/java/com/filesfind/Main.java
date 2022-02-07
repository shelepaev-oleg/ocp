package com.filesfind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Work\\_github\\ocp");
        try {
            Files.find(path, 10, (p, a) -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
