package com.staticimport;

import static com.staticimport.TestStaticImport.*;

/**
 * #20210913_0722_48/3
 */
public class StaticImport {

    public static void main(String[] args) {
        System.out.println(i);
        print();
        System.out.println(new TestStaticImport().i);
        new TestStaticImport().print();
        TestStaticImport.print();
    }
}
