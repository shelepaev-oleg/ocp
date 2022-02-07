package com.filewriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * #20211206_0752_346/1
 */
public class Main {

    public static void main(String... __) throws IOException {
        ClassLoader loader = Main.class.getClassLoader();
//        FileWriter w = new FileWriter("out.txt"); // создаст новый файл, если не существует
        FileWriter w = new FileWriter(loader.getResource("out.txt").getFile());
        try (w;
             FileReader r = new FileReader(loader.getResource("in.txt").getFile());
             BufferedReader b = new BufferedReader(r);
             w
        ) {
            w.write(b.readLine());
        }
        w.write("");
    }
}
