package com.synchronizedTest;

public class MyThread2 extends Thread {
    ISynchronized t;

    MyThread2(ISynchronized t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
