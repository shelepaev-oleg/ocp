package com.functionalinterfacerules;

/**
 * #20211021_0725_86/1
 */
public class Main {

    public static void main(String... __) {
        Test1 test1 = () -> System.out.println("Implement Test1.method");
        test1.method();

        Test2 test2 = () -> System.out.println("Implement Test2.method");
        test2.method();

//        Test3 test3 = () -> System.out.println("Implement Test3.method"); // does not compile
    }
}

@FunctionalInterface
interface Test1 {
    void method();

    @Override
    String toString();

    private void privateMethod() { System.out.println("!"); }
    private static void privateStaticMethod() { System.out.println("!"); }
    default void defaultMethod() { System.out.println("!"); }
}

interface Test2 {
    void method();
}

interface Test3 {
    void method();
    void method2();
}
