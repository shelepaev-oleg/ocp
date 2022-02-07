package com.serializeobject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * #20211207_0714_356/7
 */
class Other {
}

public class Main implements Serializable {

//    private Object object = new Object(); // NotSerializableException
//    private Other other = new Other(); // NotSerializableException

    private transient String variableConstructor;
    private transient String variableInstanceBlock;

    Main() { variableConstructor = "variableConstructor"; }

    { variableInstanceBlock = "variableInstanceBlock"; }

    public static void main(String... __) throws IOException {
        Main main = new Main();
        Test.writeFile("test.txt", main);
        Test.readFile("test.txt");
    }

    @Override
    public String toString() {
        return "variableConstructor=" + variableConstructor + ", variableInstanceBlock=" + variableInstanceBlock;
    }
}

class Test {
    static void writeFile(String fileName, Main main) throws IOException {
        ClassLoader loader = Main.class.getClassLoader();
        try (FileOutputStream f = new FileOutputStream(loader.getResource(fileName).getFile());
             BufferedOutputStream b = new BufferedOutputStream(f);
             ObjectOutputStream out = new ObjectOutputStream(b)) {
            out.writeObject(main);
        }
    }

    static void readFile(String fileName) throws IOException {
        ClassLoader loader = Main.class.getClassLoader();
        try (FileInputStream f = new FileInputStream(loader.getResource(fileName).getFile());
             BufferedInputStream b = new BufferedInputStream(f);
             ObjectInputStream in = new ObjectInputStream(b)) {
            while (true) {
                Object o = in.readObject();
                if (o instanceof Main) {
                    System.out.println(o);
                }
            }
        } catch (EOFException e) {
            // it's okay
        } catch (ClassNotFoundException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
