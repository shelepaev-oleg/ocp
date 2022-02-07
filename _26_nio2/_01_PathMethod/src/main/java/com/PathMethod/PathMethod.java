package com.PathMethod;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210420_0711_379
 */
public class PathMethod {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_01_PathMethod\\src\\main\\java\\com\\PathMethod\\PathMethod.java");
        System.out.println(path.toString());
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }

        printPathInformation(path);
    }

    private static void printPathInformation(Path path) {
        System.out.println("Filename is: "+path.getFileName());
        System.out.println("Root is: "+path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: "+currentParent);
        }
    }
}
