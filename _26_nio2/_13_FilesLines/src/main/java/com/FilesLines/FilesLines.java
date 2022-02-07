package com.FilesLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * #20210525_0846_399
 */
public class FilesLines {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./log.text");
        Files.lines(path) // r1
                .flatMap(p -> Stream.of(p.split(","))) // r2
                .map(String::toUpperCase) // r3
                .forEach(System.out::println);
    }
}
