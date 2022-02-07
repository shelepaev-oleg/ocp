package com.GetName;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetName {

    public static void main(String[] args) {
        Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());
    }
}
