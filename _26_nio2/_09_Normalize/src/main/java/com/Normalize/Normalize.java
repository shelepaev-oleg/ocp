package com.Normalize;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210517_0759_405
 */
public class Normalize {

    public static void main(String[] args) {
        notReturn();
        returnNewPathObject();
    }

    /**
     * Методы normalize(), relativize() не изменяют исходный объект, а возвращают новый
     */
    private static void notReturn() {
        Path path1 = Paths.get("/user/.././root","../kodiacbear.txt");
        Path path2 = Paths.get("/lion");
        path1.normalize().relativize(path2);
        System.out.println(path1);
    }

    private static void returnNewPathObject() {
        Path path1 = Paths.get("/user/.././root","../kodiacbear.txt");
        Path path2 = Paths.get("/lion");
        Path path3 = path1.normalize();
        System.out.println(path3.relativize(path2));
    }
}
