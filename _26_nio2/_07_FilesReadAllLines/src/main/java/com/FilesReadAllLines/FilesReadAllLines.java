package com.FilesReadAllLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * #20210428_0737_390
 */
public class FilesReadAllLines {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_07_FilesReadAllLines\\src\\main\\resources\\2.txt");
        try {
            List<String> list = Files.readAllLines(path);
            for (String l : list) {
                System.out.println(l);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
