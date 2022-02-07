package com.classMethodInterfaceCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * #20210206_2034_220/1
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

//    public <> void testMethod1() {}
    public <T> void testMethod2() {}
    public <T> T testMethod2_2(T t) {return t;}
//    public <?> void testMethod3() {}
    public <String> void testMethod4() {}

//    public void param1(List<> list) {}
//    public void param2(List<T> list) {}
    public void param3(List<?> list) {}
    public void param4(List<String> list) {}

//    public <>void type1(List<> list) {}
    public <T>void type2(List<T> list) {}
//    public <?>void type3(List<?> list) {}
    public <String>void type4(List<String> list) {}

//    List<> list1 = new ArrayList<>();
//    List<T> list2 = new ArrayList<T>();
    List<?> list3 = new ArrayList<>();
    List<String> list4 = new ArrayList<>();
}

//class TestClass1<> {}
class TestClass2<T> {}
//class TestClass3<?> {}
class TestClass4<String> {}

//interface TestInterface1<> {}
interface TestInterface2<T> {}
//interface TestInterface3<?> {}
interface TestInterface4<String> {}