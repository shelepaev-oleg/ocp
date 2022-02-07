package com.privateconstructor;

/**
 * #20210915_0756_44/3
 */
//----------------------------------------------------------------------------------------------------------------------
class Parent1 {

    private Parent1() {}

    Parent1(int i) {}
}

class Child1 extends Parent1 {
//public class Child extends Parent {

    Child1(int i){
        super(i);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Parent2 {
    private Parent2() {}
}

class Child2 {
//public class Child extends Parent { // does not compile
}
//----------------------------------------------------------------------------------------------------------------------
public class PrivateConstructor {

    public static void main(String... __) {
	// write your code here
    }
}
