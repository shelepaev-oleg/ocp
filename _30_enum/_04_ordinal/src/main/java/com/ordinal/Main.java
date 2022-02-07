package com.ordinal;

/**
 * #20211020_0713_327
 */
public class Main {

    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
        }
    public static void main(String[] args) {
        for(final var e : Flavors.values())
            System.out.print(e.ordinal()+" ");
    }
}
