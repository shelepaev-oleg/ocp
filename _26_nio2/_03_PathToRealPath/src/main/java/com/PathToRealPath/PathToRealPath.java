package com.PathToRealPath;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210425_0759_383
 */
public class PathToRealPath {

    public static void main(String[] args) {
        System.out.println("toAbsolutePath");
        toAbsolutePath();

        System.out.println("toRealPath");
        toRealPath();
    }

    private static void toAbsolutePath() {
        Path path1 = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_03_PathToRealPath\\src\\main\\resources\\link.lnk");
        Path path2 = path1.toAbsolutePath();
        System.out.println(path2);
    }

    private static void toRealPath() {
        try {
            Path path1 = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_03_PathToRealPath\\src\\main\\resources\\link.lnk");
            Path path2 = path1.toRealPath();
            System.out.println(path2);
            System.out.println(Paths.get(".").toRealPath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
