package com.interfacerules;

/**
 * #20210924_0758_78/3
 */
abstract interface Test { // интерфейс может быть объявлен с ключевым словом abstract

    void method1();
    public abstract void method2();

    int i1 = 1;
    public static final int i2 = 1;

//    private final void method3() {} // does not compile
//    public final void method3_() {} // does not compile

    private static void method4() {}
    public static void method4_() {}

    default void method5() {}
    public default void method5_() {}
//    private default void method5__() {}

//    static final void method6() {}

//    default final void method7() {}
//    default static void method7_() {}
}

abstract class C implements Test {

}

public class InterfaceRules {

    public static void main(String... __) {
	// write your code here
    }
}
