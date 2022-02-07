package com.doprivilegedimplement;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * #java_202201301310
 */
public class Main {

    public static void main(String... __) {
        GetPropertyAction gpa = new GetPropertyAction("user.name");
        AccessController.doPrivileged(gpa);
        String user = gpa.getValue();
        System.out.println(user);

        String user2 = (String) AccessController.doPrivileged(
                new GetPropertyAction("user.name"));
        System.out.println(user2);
    }
}

class GetPropertyAction implements PrivilegedAction {
    private String property;
    private String value;
    public GetPropertyAction(String prop) {
        property = prop;
    }
    public Object run() {
        value = System.getProperty(property);
        return value;
    }
    public String getValue() {return value;}

}
