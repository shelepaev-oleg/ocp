package com.FilesCopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * #20210425_1823_386
 */
public class FilesCopy {

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_04_FilesCopy\\src\\main\\resources\\panda"),
                Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_04_FilesCopy\\src\\main\\resources\\panda-new"));
    }
}
