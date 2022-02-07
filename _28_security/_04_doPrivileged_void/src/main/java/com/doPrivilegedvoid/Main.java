package com.doPrivilegedvoid;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * #java_202201301247
 */
public class Main {

    public static void main(String... __) {
        AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                // privileged code goes here, for example:
                System.loadLibrary("awt");
                System.out.println("!");
                return null; // nothing to return
            }
        });
    }
}
