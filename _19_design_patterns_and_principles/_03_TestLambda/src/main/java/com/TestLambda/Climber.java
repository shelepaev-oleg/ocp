package com.TestLambda;

interface Climb {
    boolean isTooHigh(int height, int limit);
}
public class Climber {
    public static void main(String[] args) {
        check((h, l) -> String.valueOf(h).length() > 5, 5); // x1
    }
    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    } }
