package com.synchronizedTest;

/**
 * synchronized method
 */
public class SynchronizedMethod implements ISynchronized {

    public synchronized void printTable(int n) {//synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void main() {
        SynchronizedMethod obj = new SynchronizedMethod();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
