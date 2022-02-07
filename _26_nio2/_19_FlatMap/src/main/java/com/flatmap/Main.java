package com.flatmap;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * #20211210_0710_400
 */
public class Main {

    public static void main(String... __) throws IOException, URISyntaxException {
        ClassLoader l = Main.class.getClassLoader();
        Path p = Paths.get(l.getResource("test.txt").toURI());
        Files.lines(p)
                .flatMap(s -> Stream.of(s))
                .forEach(System.out::println);

        Files.readAllLines(p)
                .forEach(System.out::println);
    }
}
