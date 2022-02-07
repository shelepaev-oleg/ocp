package com.equality;

public class Equality {

    public static void main(String[] args) {
        System.out.println(false & true == false);      // false, т.к. приоритет операций сначала == , потом &
        System.out.println((false & true) == false);    // true
    }
}
