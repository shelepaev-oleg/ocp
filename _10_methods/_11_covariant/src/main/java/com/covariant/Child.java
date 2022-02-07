package com.covariant;

import java.util.ArrayList;
import java.util.List;

class Parent {
    List<String> method(List<String> param) { return null; }
}

public class Child extends Parent {

    // override
    @Override ArrayList<String> method(List<String> param) { return null; } // ok

    // overload
    List<String> method(ArrayList<String> param) { return null; }

    public static void main(String... __) {
        Parent parent = new Child();
    }
}
