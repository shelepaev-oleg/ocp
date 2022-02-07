package com.instanceblock;

public class InstanceBlock {

    private final int i;

    {
        i = 1;
    }

    public InstanceBlock(int i) {
//        this.i = i; // does not compile
    }

    public static void main(String... __) {
    }
}
