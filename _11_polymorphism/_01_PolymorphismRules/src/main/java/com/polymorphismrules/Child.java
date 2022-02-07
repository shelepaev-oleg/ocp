package com.polymorphismrules;

public class Child extends Parent {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Child{" +
                "i=" + i +
                '}';
    }
}
