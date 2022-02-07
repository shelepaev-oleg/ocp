package com.StuckTurkeyCage;

import java.io.Closeable;

/**
 * #20210531_0538_412/1
 */
public class StuckTurkeyCage implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
    public static void main(String[] args) throws Exception {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
        try(Test t = new Test()) {
        }
    }
}

class Test implements Closeable {
    public void close() {
    }
}
