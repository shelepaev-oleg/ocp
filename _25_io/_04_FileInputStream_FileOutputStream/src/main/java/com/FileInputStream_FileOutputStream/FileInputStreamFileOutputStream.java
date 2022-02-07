package com.FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * #20210405_0800_352
 */
public class FileInputStreamFileOutputStream {

    public static void main(String[] args) throws IOException {
        URL source = FileInputStreamFileOutputStream.class.getClassLoader().getResource("input.txt");
        URL destination = FileInputStreamFileOutputStream.class.getClassLoader().getResource("output.txt");
        copy(source.getPath(), destination.getPath());

        // Пишет в файл
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\57ShelepaevOA\\Desktop\\test.txt", true);
        String greetings = "Привет!";
        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();
    }

    private static void copy (String source, String destination) {
        try (InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
