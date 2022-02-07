package com.blockingDequeTest;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class Main {

    public void addAndPrintItems(BlockingDeque<Integer> deque) {
        deque.offer(103);
        deque.add(103);
//        deque.put(103);
//        deque.offer(103, 1, TimeUnit.SECONDS);
//        deque.offerFirst(20, 1, TimeUnit.SECONDS);
//        deque.offerLast(85, 7, TimeUnit.HOURS);
//        System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
//        System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
    }

    public static void main(String[] args) {
	// write your code here
    }
}
