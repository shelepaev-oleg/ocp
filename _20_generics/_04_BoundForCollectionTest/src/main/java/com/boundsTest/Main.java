package com.boundsTest;

import java.util.ArrayList;
import java.util.List;

/**
 * #20210123_0717_209
 */
public class Main {

    public static void main(String[] args) {

        List<?> list1 = new ArrayList<A>(); // ok

        List<? extends A> list2 = new ArrayList<A>(); //ok
        List<? extends A> list3 = new ArrayList<B>(); //ok
        List<? extends A> list4 = new ArrayList<D>(); //ok

        List<? extends B> list5 = new ArrayList<B>(); //ok
        List<? extends B> list6 = new ArrayList<D>(); //ok
//        List<? extends B> list7 = new ArrayList<A>(); //does not compile

        List<? super B> list8 = new ArrayList<B>(); //ok
        List<? super B> list9 = new ArrayList<A>(); //ok
//        List<? super B> list10 = new ArrayList<D>(); //does not compile

//        List<?> list11 = new ArrayList<? extends A>(); //does not compile
//        List<A> list12 = new ArrayList<? extends A>(); //does not compile
    }

//    <X> void method5(List<X super B> list) { // DOES NOT COMPILE
//    }
}

class A {}

class B extends A {}

class C extends A {}

class D extends B {}
