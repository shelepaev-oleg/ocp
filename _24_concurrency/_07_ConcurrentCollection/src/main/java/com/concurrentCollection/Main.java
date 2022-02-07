package com.concurrentCollection;

/**
 * Чтоб включить assert нужно добавить флаг -ea в Run -> Edit Configurations -> VM Options
 * #20210107_0916_174
 */
public class Main {

    public static void main(String[] args) {
        CopyOnWriteArrayListTest copyOnWriteArrayListTest = new CopyOnWriteArrayListTest();
        copyOnWriteArrayListTest.main();

        ConcurrentSkipListSetTest concurrentSkipListSetTest = new ConcurrentSkipListSetTest();
        concurrentSkipListSetTest.main();

        ConcurrentLinkedQueueTest concurrentLinkedQueueTes = new ConcurrentLinkedQueueTest();
    }
}
