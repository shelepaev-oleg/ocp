import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * #20210608_0554_356/1
 * https://coderoad.ru/1168348/Java-%D1%81%D0%B5%D1%80%D0%B8%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D1%8F-readObject-%D0%BF%D1%80%D0%BE%D1%82%D0%B8%D0%B2-readResolve
 */
public class ReadResolveTest implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final ReadResolveTest INSTANCE = new ReadResolveTest();

    private ReadResolveTest() {
        if (INSTANCE != null)
            throw new RuntimeException("Singleton instance already exists!");
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("ReadObjectVsReadResolve.leaveTheBuilding() called...");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ReadResolveTest instance = ReadResolveTest.INSTANCE;

        System.out.println("Before serialization: " + instance);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.ser"))) {
            out.writeObject(instance);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1.ser"))) {
            ReadResolveTest readObject = (ReadResolveTest) in.readObject();
            System.out.println("After deserialization: " + readObject);
        }

        ReadResolveTest instance2 = ReadResolveTest.INSTANCE;
        System.out.println(instance2);
    }
}
