package com.FilesCopy2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * #20210525_0807_386
 */
public class FilesCopy2 {

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("./log.txt").normalize(); // k1
        Path path2 = Paths.get("mule.png");
        Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES); //k2
        System.out.println(Files.isSameFile(path1, path2)); //k3
    }
}
