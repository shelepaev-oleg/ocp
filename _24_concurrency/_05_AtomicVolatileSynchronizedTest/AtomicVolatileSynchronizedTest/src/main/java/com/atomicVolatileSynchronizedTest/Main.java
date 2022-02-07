package com.atomicVolatileSynchronizedTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * #20210106_1342
 * Сравнение Atomic Volatile Synchronized
 * https://javarevisited.blogspot.com/2020/04/difference-between-atomic-volatile-and-synchronized-in-java-multi-threading.html#axzz6ijudPZqL
 */
public class Main {

    public static void main(String[] args) {
        final IntegerCounter counter = new IntegerCounter();
        // ожидает пока все потоки начнут выполнение
        final CyclicBarrier startingBarrier = new CyclicBarrier(5);
        // ожидает пока все потоки завершат выполнение
        final CyclicBarrier endingBarrier = new CyclicBarrier(6);
        Runnable task = () -> {
            try {
                startingBarrier.await();
                for (int i = 0; i < 1000; i++){
                    counter.countIncrement();
                }
                endingBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
        Thread T1 = new Thread(task);
        T1.start();
        Thread T2 = new Thread(task);
        T2.start();
        Thread T3 = new Thread(task);
        T3.start();
        Thread T4 = new Thread(task);
        T4.start();
        Thread T5 = new Thread(task);
        T5.start();
        try {
            endingBarrier.await();
            System.out.println("Expected count : 5001" + " Actual count : " + counter.countIncrement());
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

/**
 * #1
 */
//class IntegerCounter {
//    private int count = 1;
//    public int countIncrement() {return count++;}
//}

/**
 * #2 - volatile
 */
//class IntegerCounter {
//    private volatile int count = 1;
//    public int countIncrement() {return count++;}
//}

/**
 * #3 - synchronized
 */
//class IntegerCounter {
//    private volatile int count = 1;
//    public synchronized int countIncrement() {return count++;}
//}

/**
 * #4 - Atomic
 */
class IntegerCounter {
    private AtomicInteger count = new AtomicInteger(1);
    public int countIncrement(){ return count.getAndIncrement(); }
}