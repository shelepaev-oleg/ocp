package com.suppressed2;

/**
 * #20211122_0807_410/2
 */
public class Test implements AutoCloseable {
    public void close() {
        throw new RuntimeException("flurry");
    }

    public static void main(String[] args) {
        Test walk1 = new Test();
        try (walk1; Test walk2 = new Test()) {
            throw new RuntimeException("blizzard");
        } catch(Exception e) {
            System.out.println(e.getMessage()
                    + " " + e.getSuppressed().length);
        }
//        walk1 = null; // does not compile
    }
}
