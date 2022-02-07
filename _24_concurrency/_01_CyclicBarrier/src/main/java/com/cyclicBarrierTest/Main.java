package com.cyclicBarrierTest;

/**
 * #20210105_0810
 * #20210113_0741_183/2
 * CyclicBarrier
 */
public class Main {

    public static void main(String[] args) {
        // Плохой подход
//        LionPenManager.performTask();

        // Хороший подход
        LionPenManagerWithCyclicBarrier.performTask();
    }
}
