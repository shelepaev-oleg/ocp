package com.CastTest;

/**
 * #20210326_0740_218
 */
public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent1 = new Capybara();
        Capybara capybara1 = (Capybara) rodent1; // OK

        Rodent rodent2 = new Rodent();
        System.out.println(rodent2 instanceof Capybara); // false
        Capybara capybara2 = (Capybara) rodent2; // ClassCastException
    }
}

class Rodent {
}
