package com.FilesWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210603_0526_434
 */
public class FilesWrite {

    public static void main(String[] args) throws IOException {
        Path in = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_16_FilesWrite\\src\\main\\java\\com\\FilesWrite\\in.txt");
        Path out = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_16_FilesWrite\\src\\main\\java\\com\\FilesWrite\\out.txt");
        transform(in, out);
    }

    public static void transform(Path in, Path out) throws IOException {
        var list = Files.readAllLines(in);
        list.removeIf(s -> s.trim().isBlank());
        Files.write(out, list);
    }
}
