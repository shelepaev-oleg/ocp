package com.overridensubclass;

/**
 * #20211103_0633_62/9
 */
class Bird {
    public String getName() { return null; }
    public void printName() {
        System.out.print(getName());
    }
}
public class Stork extends Bird {
    public String getName() { return "Stork!"; }
    public static void main(String[] args) {
        new Stork().printName();
        new Bird().printName();
    }
}
