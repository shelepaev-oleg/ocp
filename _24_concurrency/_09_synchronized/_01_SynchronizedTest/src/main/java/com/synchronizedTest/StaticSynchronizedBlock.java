package com.synchronizedTest;

/**
 * static synchronized block
 */
public class StaticSynchronizedBlock implements ISynchronized {

    public static void printTableStatic(int n) {
        synchronized(StaticSynchronizedBlock.class) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printTable(int n) {
        StaticSynchronizedBlock.printTableStatic(n);
    }

    public void main() {
        StaticSynchronizedBlock obj = new StaticSynchronizedBlock();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
