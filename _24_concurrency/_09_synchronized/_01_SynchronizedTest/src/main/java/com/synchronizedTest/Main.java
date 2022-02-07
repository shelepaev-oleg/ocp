package com.synchronizedTest;

/**
 * #20210108_0617_172/1
 */
public class Main {

    public static void main(String[] args) {
//        NotSynchronized notSynchronized = new NotSynchronized();
//        notSynchronized.main();

//        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
//        synchronizedMethod.main();

//        SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
//        synchronizedBlock.main();

//        StaticSynchronizedMethod staticSynchronizedMethod = new StaticSynchronizedMethod();
//        staticSynchronizedMethod.main();

        StaticSynchronizedBlock staticSynchronizedBlock = new StaticSynchronizedBlock();
        staticSynchronizedBlock.main();
    }
}
