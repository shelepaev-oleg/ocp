package test;

import operation.Factorial;
import print.Print;

/**
 * #20211109_0722_101/7
 */
public class Main {

    public static void main(String[] args) {
        int result = Factorial.calculate(3);
        Print.print(result);
    }
}
