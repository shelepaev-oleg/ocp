package com.ObjectOutputStreamPutField;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 20210603_0609_431
 * Запускать из терминала: java ObjectOutputStreamPutField.java
 */
public class ObjectOutputStreamPutField implements Serializable {

    public static void main(final String[] args) throws IOException, ClassNotFoundException {
//        objectOutputStreamTest();
        objectInputStreamTest();
    }

    private static void objectInputStreamTest() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("log.txt"))) {
//            ObjectInputStream.GetField getField = inputStream.readFields();
            Person person = (Person) inputStream.readObject();
            System.out.println(person);
        }
    }

    private static void objectOutputStreamTest() throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("log.txt"))) {
            Person person = new Person();
            person.setFirstName("A");
            person.setLastName("B");
            person.setAge(38);
            outputStream.writeObject(person);

            ObjectOutputStream.PutField putField = outputStream.putFields();
        }
    }
}

class Person implements Serializable {

    private String firstName;

    private String lastName;

    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(firstName);
        buffer.append("\n");
        buffer.append(lastName);
        buffer.append("\n");
        buffer.append(age);
        buffer.append("\n");

        return buffer.toString();
    }
}
