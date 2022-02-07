package com.checkedexception;

/**
 * #20211003_1546_408/3
 */
class CheckedException extends Exception{}
class UncheckedException extends RuntimeException {}

interface Interface {
    void method() throws CheckedException;
}

class Test1 implements Interface {
    public void method() {}
}

class Test2 implements Interface {
    public void method() throws UncheckedException {}
}

class Test3 implements Interface {
    public void method() throws RuntimeException {}
}

//class Test4 implements Interface {
//    public void method() throws Exception {} // does not compile, т.к. исключение переопределяемого метода не может быть шире
//}

public class Main1 {

    public static void main(String... __) {
	// write your code here
    }
}
