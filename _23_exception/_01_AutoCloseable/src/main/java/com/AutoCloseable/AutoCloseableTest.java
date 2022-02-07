package com.AutoCloseable;

/**
 * #20210527_0630_413
 */
public class AutoCloseableTest {

    public static void main(String[] args) {
        try (Turkey turkey = new Turkey()) {
        } catch (Exception e) {
            System.out.println(String.format("%s exception", Turkey.class.getName()));
        }

        try (Turkey2 turkey2 = new Turkey2()) {
        }
    }
}

class Turkey implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println(String.format("%s success close", Turkey.class.getName()));
    }
}

class Turkey2 implements AutoCloseable {

    @Override
    public void close() {
        System.out.println(String.format("%s success close", Turkey2.class.getName()));
    }
}
