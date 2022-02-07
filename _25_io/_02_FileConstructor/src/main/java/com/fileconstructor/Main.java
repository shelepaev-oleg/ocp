package com.fileconstructor;

import java.io.File;

/**
 * #20211206_0716_345
 */
public class Main {

    public static void main(String... __) {
        new File("/weather/snow.data");
        new File(new File("/weather"),"snow.data");
//        new File(new File("/weather"),new File("snow.data")); // does not compile
//        new File("/weather", new File("snow.data")); // does not compile
        new File("/weather/", "snow.data");
    }
}
