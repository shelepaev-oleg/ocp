package com.doprivilegedfinal;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class Main {

    public static void main(String... __) {
        final String user[] = { null };
        AccessController.doPrivileged(
                new PrivilegedAction() {
                    public Object run() {
                        user[0] = System.getProperty("user.name");
                        return null; // still need this
                    }
                }
        );
        System.out.println(user[0]);
    }
}
