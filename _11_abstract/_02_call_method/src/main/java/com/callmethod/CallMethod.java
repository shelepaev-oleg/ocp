package com.callmethod;

interface Grandmother {
    void method1();
}

abstract class Mother {
    abstract void method2();
}

class Child extends Mother {
    void method2() {
        System.out.println("method2");
    }

    void method3() {
        System.out.println("method3");
    }
}

class Son implements Grandmother {
    public void method1() {
        System.out.println("method1");
    }

    void method3() {
        System.out.println("method3");
    }
}

public class CallMethod {

    public static void main(String... __) {
        Mother mother = new Child();
        mother.method2();
//        parent.method3(); // does not compile

        Grandmother grandmother = new Son();
//        grandmother.method3(); // does not compile
    }
}
