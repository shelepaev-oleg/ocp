package com.Suppressed;

/**
 * #20210527_0702_415
 */
public class Suppressed implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Does not close");
    }

    public static void main(String[] args) {
        try (Suppressed s = new Suppressed()) {
            throw new IllegalStateException("Ran off");
        } finally {
            throw new IllegalStateException("IllegalStateException");
        }
    }
}
