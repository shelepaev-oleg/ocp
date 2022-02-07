package com.Resolve;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210524_0811_381
 */
public class Resolve {

    public static void main(String[] args) {
        Path path1 = Paths.get("/pets/../cat.txt");
        Path path2 = Paths.get("./dog.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));

        Path path3 = Paths.get("/dog.txt");
        System.out.println(path1.resolve(path3));
        System.out.println(path3.resolve(path1));
    }
}
