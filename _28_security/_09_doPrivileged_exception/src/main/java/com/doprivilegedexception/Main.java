package com.doprivilegedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/**
 * #java_202201301326
 */
public class Main {

    public static void main(String... __) throws FileNotFoundException {
        try {
            FileInputStream fis = (FileInputStream) AccessController.doPrivileged(
                    (PrivilegedExceptionAction) () -> new FileInputStream("someFile")
            );
        } catch (PrivilegedActionException e) {
            // e.getException() should be an instance of FileNotFoundException,
            // as only "checked" exceptions will be "wrapped" in a
            // PrivilegedActionException.
            throw (FileNotFoundException) e.getException();
        }
    }
}
