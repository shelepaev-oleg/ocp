package com.concurrentlinkedqueue;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public static void main(String... __) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println();
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        System.out.println(deque.poll()); // null
        System.out.println(deque.pop()); // NoSuchElementException
    }
}
