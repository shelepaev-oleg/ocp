package com.genericStatement;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        HashSet<Number> hs = new HashSet<Integer>();
//        HashSet<Object> hs = new HashSet<Integer>();
        HashSet<? extends Number> hs = new HashSet<Integer>();

        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        
        List<String> list = new Vector<String>();

//        List<Object> values = new HashSet<Object>();
//        List<Object> values = new List<>();
        List<Object> values = new ArrayList<>();

//        List<Object> objects = new ArrayList<? extends Object>();
        List<? extends Object> objects = new ArrayList<Object>();

        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
