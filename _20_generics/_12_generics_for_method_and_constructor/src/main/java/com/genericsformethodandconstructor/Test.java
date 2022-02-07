package com.genericsformethodandconstructor;

/**
 * #20211114_0749_214/1
 */
public class Test<T> {

    T t;

    Test(T t) {
        this.t = t;
    }

    <T> void method(T t){
        System.out.println(t);
    }

    public static void main(String... __) {
        Test test = new Test("hello");
        test.method(true);
    }
}
