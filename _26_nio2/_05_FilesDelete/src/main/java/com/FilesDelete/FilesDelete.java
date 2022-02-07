package com.FilesDelete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210427_0842_388
 */
public class FilesDelete {

    public static void main(String[] args) {
        try {
            Files.delete(Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_05_FilesDelete\\src\\main\\resources\\1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.deleteIfExists(Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_05_FilesDelete\\src\\main\\resources\\2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
