package com.FilesFind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * 20210525_0824_398
 * Т.к. в данном примере глубина = 0, то выведется только сам Path
 */
public class FilesFind {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./template");
        Files.find(path, 0, (p, a) -> !a.isSymbolicLink()).map(Path::toString) // y1
                .collect(Collectors.toList()) // y2
                .stream() // y3
                .filter(x -> !x.toString().endsWith(".txt")) // y4
                .forEach(System.out::println);
    }
}
