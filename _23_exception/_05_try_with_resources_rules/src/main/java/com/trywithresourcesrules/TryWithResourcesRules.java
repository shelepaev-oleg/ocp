package com.trywithresourcesrules;

/**
 * #20210930_0755_40/1
 */
class Parent implements AutoCloseable {
    public void close() {}
}

class Child extends Parent{}

public class TryWithResourcesRules {

    public static void main(String... __) {
//        try(String s = new String()){} // does not compile
        try (Parent parent = new Parent()){}

//        try (Parent parent = new Parent(), parent = new Parent()){} // does not compile
    }
}
