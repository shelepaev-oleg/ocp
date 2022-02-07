package com.doprivilegedreturn;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class Main {

    public static void main(String... __) {
        String user = (String) AccessController.doPrivileged(
                (PrivilegedAction) () -> System.getProperty("user.name")
        );
        System.out.println(user);
    }
}
