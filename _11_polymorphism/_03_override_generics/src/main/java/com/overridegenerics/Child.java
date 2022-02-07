package com.overridegenerics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * #20210918_1005_62/1
 */
class Parent {

    // Дженерики
    void test1(List<String> l){ System.out.println("Parent test1"); }

    // Параметры
    void test2(CharSequence s) { System.out.println("Parent test2"); }
    void test3(String s) { System.out.println("Parent test3"); }
    void test4(Object s) { System.out.println("Parent test4"); }
    void test5(String s) { System.out.println("Parent test5"); }

    // Return
    List<String> test6() { System.out.println("Parent test6"); return null; }
    ArrayList<String> test7() { System.out.println("Parent test7"); return null; }

    // Modifiers
    protected void test8() { System.out.println("Parent test8"); }

    // Checked Exception
    void test9() throws Exception { System.out.println("Parent test9"); }
    void test10() throws IOException { System.out.println("Parent test10"); }

    // Unchecked Exception
    void test11() throws RuntimeException { System.out.println("Parent test11"); }
    void test12() { System.out.println("Parent test12"); }
}

public class Child extends Parent {

    // Дженерики
    // ok, т.к. параметры дженерика точно соответствуют
    void test1(List<String> l) { System.out.println("Child test1"); }
    // does't compile, т.к. дженерика приобразуется в Object List<CharSequence> -> List<Object>
//    void test1(List<CharSequence> l) { }

    // Параметры
    void test2(String s) { System.out.println("Child test2"); }
    void test3(CharSequence s) { System.out.println("Child test3"); }
    void test4(String o) { System.out.println("Child test4"); }
    void test5(Object s) { System.out.println("Child test5"); }

    // Return
    ArrayList<String> test6() { System.out.println("Child test6"); return null; }
    // does't compile, т.к. возвращаемый тип должен быль или такой же или подтип
//    List<String> test7() { System.out.println("Child test7"); return null; }

    // Modifiers
    // does't compile, т.к. package-private уже чем protected родительского
//    void test8() { System.out.println("Child test8"); }
    // ok, т.к. public шире чем protected родительского
    public void test8() { System.out.println("Child test8"); }

    // Checked Exception
    // ok, т.к. checked exception является подтипом родительского
    void test9() throws IOException { System.out.println("Child test9"); }
    // does't compile, т.к. checked exception является надтипом родительского
//    void test10() throws Exception { System.out.println("Child test10"); }

    // Unchecked Exception
    void test11() { System.out.println("Child test11"); }
    void test12() throws RuntimeException { System.out.println("Child test12"); }

    public static void main(String... __) throws Exception {
        Child child = new Child();
        child.test1(null);
        child.test2(null);
        child.test2("");
        child.test3(null);
        child.test4(null);
        child.test5(null);
        child.test6();
        child.test7();
        child.test8();
        child.test9();
        child.test10();
        child.test11();
        child.test12();
    }
}
