package com.superextends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * #java_202201301437
 *
 * https://ru.stackoverflow.com/questions/613240/%D0%A0%D0%B0%D0%B7%D0%BB%D0%B8%D1%87%D0%B8%D1%8F-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-extend-%D0%B8-super-%D0%B2-generics
 * https://dzone.com/articles/covariance-and-contravariance
 */
public class Main {

    private static void test(List<? extends B> list){
    }

    private static List<? extends B> test2() {
        return Collections.emptyList();
    }

    public static void main(String... __) {

        List<? super B> l1 = new ArrayList<>();
//        l1.add(new A());
        l1.add(new B());
        l1.add(new C());

        // Но:
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        l1 = aList;
        l1 = bList;
//        l1 = cList; // <? super B>

        // В <? extends> нельзя добавлять элементы!
        // Можно только присваивать
        // Потому что компилятор не может определить тип универсального списка (чтоб нельзя было добавить B в список C)
        // https://stackoverflow.com/questions/45609642/why-we-cant-add-the-elements-in-java-generics-using-extends-bounds#:~:text=2%20Answers&text=This%20is%20due%20to%20the,doesn%C2%B4t%20allow%20you.
        List<? extends B> l2 = new ArrayList<>();
        l2.add(null);
//        l2.add(new A());
//        l2.add(new B());
//        l2.add(new C());

        // Но
        test(cList);
//        cList = test2();

        // Но:
//        l2 = aList; // <? extends B>
        l2 = bList;
        l2 = cList;
    }
}

class A {}
class B extends A {}
class C extends B {}
