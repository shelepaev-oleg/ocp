package com.ObjectStreamFieldTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

/**
 * 20210602_0620_431
 */
public class ObjectStreamFieldTest implements Serializable {

    private static String name = "Oleg";
    private static String ssn = "111";
    private static int age = 32;

    @Override
    public String toString() {
        return "{name = " + name + ", ssn = " + ssn + ", age = " + age + "}";
    }

    private static final ObjectStreamField[] serialPersistentFields = {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("ssn", String.class)
    };

    private static String encrypt(final String input) {
        return input;
    }

    private static String decrypt(final String input) {
        return input;
    }

    private static void writeObject(final ObjectOutputStream s) throws IOException {
        ObjectOutputStream.PutField fields = s.putFields();
        fields.put("name", name);
        fields.put("ssn", encrypt(ssn));
        s.writeFields();
    }
    private  static void readObject(final ObjectInputStream s) throws IOException, ClassNotFoundException {
        ObjectInputStream.GetField fields = s.readFields();
        name = (String)fields.get("name", null);
        ssn = decrypt((String)fields.get("ssn", null));
    }

    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            writeObject(oos);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
            ObjectStreamFieldTest objectStreamFieldTest = (ObjectStreamFieldTest) ois.readObject();
            System.out.println(objectStreamFieldTest);
        }
    }
}
