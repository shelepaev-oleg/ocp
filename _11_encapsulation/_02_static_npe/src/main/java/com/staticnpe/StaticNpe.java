package com.staticnpe;

/**
 * #20210913_0746_48/4
 */
public class StaticNpe {

    int i;

    public StaticNpe() {
        i = 1;
    }

    static String test() {
        return "test";
    }

    public static void main(String[] args) {
        StaticNpe s = new StaticNpe();
        System.out.println(s.i); //1

        s = null;
        System.out.println(s.test());
        System.out.println(s.i); //0
    }
}
