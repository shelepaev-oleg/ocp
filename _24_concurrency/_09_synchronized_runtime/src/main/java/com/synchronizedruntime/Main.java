package com.synchronizedruntime;

public class Main {

    public static void main(String... __) throws InterruptedException {
        new Main().method();
    }

    static int count;
    synchronized static void testMethod() {
        count++;
    }
//    synchronized Main(){} // конструктор не может быть synchronized
    private void method() throws InterruptedException {
        Runnable task = Main::testMethod;
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
