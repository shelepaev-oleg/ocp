package com.synchronizedTest;

public class MyThread1 extends Thread {
    ISynchronized t;

    MyThread1(ISynchronized t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}
