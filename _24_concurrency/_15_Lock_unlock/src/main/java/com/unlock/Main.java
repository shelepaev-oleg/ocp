package com.unlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * #20211204_1013_172/6
 */
public class Main {

    private Lock lk = new ReentrantLock();
    private int total = 0;
    public void deposit(int value) {
        lk.lock();
        lk.lock();
        try {
            total += value;
        } finally {
            lk.unlock();
            lk.unlock();
        }
    }
    public static void main(String[] unused) {
        var bank = new Main();
        IntStream.range(1, 1000).parallel()
                .forEach(s -> bank.deposit(s));
        System.out.println(bank.total);
    }
}
