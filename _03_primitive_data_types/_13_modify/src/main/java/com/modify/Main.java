package com.modify;

public class Main {

    int a, b, c;

    void methodX(int a) {
        a = setA(a);
        setBC(a, a);
    }

    void methodY(int a, int b) {
        b = setBC(a, b);
        setA(b);
    }

    int setA(int a) {
        return a = a;
    }

    int setBC(int a, int b) {
        c = b = a;
        return b;
    }

    public static void main(String... __) {
        Main m = new Main();
        m.setA(1);
        m.setBC(1, 1);

        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
    }
}
