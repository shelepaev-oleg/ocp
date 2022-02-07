package com.Dot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210525_2147_383
 * http://tutorials.jenkov.com/java-nio/path.html
 */
public class Dot {

    public static void main(String[] args) throws IOException {
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());

        Path path = Paths.get("./log.text");
        System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS).toString());

        Path path2 = Paths.get("C:\\Work\\_github\\ocp", "template\\..\\log.text");
        System.out.println(path2.toAbsolutePath().toString());
        System.out.println(path2.normalize().toString());
        System.out.println(path2.toRealPath(LinkOption.NOFOLLOW_LINKS).toString());
//        test();
    }

    private static void test() throws IOException {
        System.out.println("---");

        Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt")); // /lizard/./walking.txt
        System.out.println(path1.toAbsolutePath());

        Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
        System.out.println(path2.toAbsolutePath());

        System.out.print(Files.isSameFile(path1, path2));
        System.out.print(" " + path1.equals(path2));
        System.out.print(" " + path1.normalize().equals(path2.normalize()));
    }
}
