package com.synchronizedTest;

/**
 * static synchronized method
 */
public class StaticSynchronizedMethod implements ISynchronized {

    public static synchronized void printTableStatic(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void printTable(int n) {
        StaticSynchronizedMethod.printTableStatic(n);
    }

    public void main() {
        StaticSynchronizedMethod obj = new StaticSynchronizedMethod();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
