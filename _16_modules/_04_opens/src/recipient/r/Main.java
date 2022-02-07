package r;

import d.Interface;

import java.lang.reflect.Method;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("d.Test");
        for (Method m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        ServiceLoader<Interface> s = ServiceLoader.load(Interface.class);
        for (Interface impl: s) {
            impl.test();
        }
    }
}
