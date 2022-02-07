package com.pathof;

import java.nio.file.Path;

/**
 * #20211208_0755_377
 */
public class Main {

    public static void main(String... __) {
        Path path = Path.of("/user/./root","../kodiacbear.txt");
        System.out.println(path);
        Path path2 = path.normalize();
        System.out.println(path2);

        System.out.println(path2.resolve("123"));
    }
}
