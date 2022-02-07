package com.genereicsMethodError;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<B> list1 = new ArrayList<>();
        A a = method2(list1);

//        D d = method2(list1); // DOES NOT COMPILE
    }

    private static <T extends A> B method2(List<B> list) {
        return new B(); // OK
    }

//    private static <B extends A> B method3(List<B> list) {
//        return new B(); // DOES NOT COMPILE
//    }

    private static B method4(List<B> list) {
        return new B(); // OK
    }
}

class A {}

class B extends A {}

class C extends A {}

class D extends B {}
