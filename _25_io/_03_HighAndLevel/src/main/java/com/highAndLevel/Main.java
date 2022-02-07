package com.highAndLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * #20210403_0803_347
 */
public class Main {

    public static void main(String[] args) throws IOException {
        lowLevel();
        System.out.println("------------------");
        highLevel();
    }

    /**
     * Низкоуровнеый поток
     */
    private static void lowLevel() throws IOException {
        URL resource = Main.class.getClassLoader().getResource("zoo-data.txt");
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        }
        FileReader reader = new FileReader(resource.getPath());
        while (reader.ready()) {
            System.out.println(reader.read()); //читаем один символ (char будет расширен до int)
        }
        //закрываем потоки после использования
        reader.close();
    }

    /**
     * Высокоуровневый поток
     */
    private static void highLevel() {
        URL resource = Main.class.getClassLoader().getResource("zoo-data.txt");
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(resource.getPath()))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
