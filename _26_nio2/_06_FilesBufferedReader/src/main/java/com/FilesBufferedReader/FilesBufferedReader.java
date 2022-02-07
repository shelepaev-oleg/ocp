package com.FilesBufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * #20210428_0726_389
 */
public class FilesBufferedReader {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Work\\_github\\ocp\\_26_nio2\\_06_FilesBufferedReader\\src\\main\\resources\\2.txt");

        List<String> list = Arrays.asList("1", "2", "3");
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset())) {
            for (String l: list) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
