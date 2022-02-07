package com.GetNameCount;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * #20210525_2201_379
 */
public class GetNameCount {

    public static void main(String[] args) {
        final Path path = Paths.get(".").normalize(); // h1
        System.out.println(path);
        int count = 0;
        for(int i=0; i<path.getNameCount(); ++i) {
            count++;
        }
        System.out.println(count);

        Path path2 = Paths.get("C:\\Work\\_github\\ocp", "template\\..\\log.text");
        System.out.println(path2.getNameCount());
    }
}
