package com.synchronizedTest;

/**
 * synchronized block
 */
public class SynchronizedBlock implements ISynchronized {
    public void printTable(int n) {
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }

//    private Object lock1 = new Object();
//    public void printTable(int n) {
//        synchronized(lock1){//synchronized block
//            for(int i=1;i<=5;i++){
//                System.out.println(n*i);
//                try{
//                    Thread.sleep(400);
//                }catch(Exception e){System.out.println(e);}
//            }
//        }
//    }

    public void main() {
        SynchronizedBlock obj = new SynchronizedBlock();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
