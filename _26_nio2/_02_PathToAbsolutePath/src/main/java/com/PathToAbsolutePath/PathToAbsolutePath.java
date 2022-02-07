package com.PathToAbsolutePath;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210420_0716_379
 */
public class PathToAbsolutePath {

    public static void main(String[] args) {
        Path path = Paths.get("PathToAbsolutePath.java");
        System.out.println(path.toString());

        System.out.println(path.isAbsolute());
        Path abs = path.toAbsolutePath();
        System.out.println(abs);
    }
}
