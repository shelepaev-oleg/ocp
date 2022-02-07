package com.doPrivilegedwithout;

/**
 * #java_202201301348
 */
public class Main {

    public static void main(String... __) {
        System.setSecurityManager(new SecurityManager());
        String user = System.getProperty("user.name");
        System.out.println(user);
    }
}
