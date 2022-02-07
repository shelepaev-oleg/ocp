package com.runnabletest;

import java.util.stream.LongStream;

/**
 * #20211203_0757_156/1
 */
public class Main {
    private static int counter;
    public static void main(String ... __) {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(1, 500)
                .forEach(m -> new Thread(task).run());
        System.out.println(counter); // 499, т.к. range() вернет от 1 до 499, а метод run() работает синхронно
    }
}
