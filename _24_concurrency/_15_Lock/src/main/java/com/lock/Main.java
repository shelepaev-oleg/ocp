package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Lock - это аналог synchronized
 * #20211202_0640_172/5
 */
public class Main {

    private Lock lk = new ReentrantLock();
    private int total = 0;
    public void deposit(int value) {
        lk.tryLock();
        try {
            total += value;
        } finally {
            lk.unlock(); // Возможно IllegalMonitorStateException
        }
    }
    public static void main(String[] unused) {
        var bank = new Main();
        IntStream.range(1, 1000).parallel()
                .forEach(s -> bank.deposit(s));
        System.out.println(bank.total);
    }
}
