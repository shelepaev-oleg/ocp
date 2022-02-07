package com.offer;

import java.util.LinkedList;

public class Main {

    public static void main(String... __) {
        var test = new LinkedList<Integer>();

        // offer помещает в конец
        test.offer(1);
        System.out.println(test); // 1
        test.offer(2);
        System.out.println(test); // 1, 2

        // peek возвращает первый элемент, ничего не удаляет
        System.out.println(test.peek()); // 1
        System.out.println(test); // 1, 2

        // push помечает в начало
        test.push(3);
        System.out.println(test); // 3, 1, 2

        // МЕТОДЫ ДЛЯ Stack-а
        // poll возвращает первый элемент и удаляет его
        System.out.println(test.poll()); // 3
        System.out.println(test); // 1, 2

        // pop возвращает первый элемент и удаляет его, если элемента нет, то генерирует исключение
        System.out.println(test.pop());
        System.out.println(test); // 2
    }
}
