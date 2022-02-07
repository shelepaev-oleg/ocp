package com.serializetest;

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
 * #20211205_1717_356/5
 */
class Parent {
    String firstName;
    String lastName;
    Parent() { lastName = "Parent lastName"; }
}

public class Child extends Parent implements Serializable {

    String secondName;

    public static void main(String... __) throws IOException {
        Child child = new Child();
        child.firstName = "Child firstName"; // При дисериализации эта переменная обнулится
        child.lastName = "Child lastName"; // При дисериализации вызовется коструктор Parent и значение будет "Parent lastName"
        child.secondName = "Child secondName";
        Test.writeFile("test.txt", child);
        Test.readFile("test.txt");
    }

    public String toString() {
        return "firstName=" + firstName + ",lastName=" + lastName + ", secondName=" + secondName;
    }
}

class Test {
    static void writeFile(String fileName, Parent parent) throws IOException {
        ClassLoader loader = Child.class.getClassLoader();
        try (FileOutputStream f = new FileOutputStream(loader.getResource(fileName).getFile());
             BufferedOutputStream b = new BufferedOutputStream(f);
             ObjectOutputStream out = new ObjectOutputStream(b)) {
            out.writeObject(parent);
        }
    }

    static void readFile(String fileName) throws IOException {
        ClassLoader loader = Child.class.getClassLoader();
        try (FileInputStream f = new FileInputStream(loader.getResource(fileName).getFile());
             BufferedInputStream b = new BufferedInputStream(f);
             ObjectInputStream in = new ObjectInputStream(b)) {
            while (true) {
                Object o = in.readObject();
                if (o instanceof Child) {
                    System.out.println(o);
                }
            }
        } catch (EOFException | ClassNotFoundException e) {

        }
    }
}
