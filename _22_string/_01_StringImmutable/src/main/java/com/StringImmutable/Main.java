package com.StringImmutable;

public class Main {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder().append("123");
        StringBuilder s2 = new StringBuilder().append("123");
        System.out.println(s1 == s2); // false

        StringBuilder s = new StringBuilder("abcde");
        s.insert(1, '-');
        System.out.println(s);

        s.delete(3, 3);
        System.out.println(s);

        s.delete(3, 4);
        System.out.println(s);
    }
}
