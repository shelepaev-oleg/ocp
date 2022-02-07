import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * #20210410_0716_356/1
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class ObjectOutputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (FileOutputStream fileOutputStream = new FileOutputStream("log.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {
            objectOutputStream.writeObject(1);
            objectOutputStream.writeObject(2L);
            objectOutputStream.writeObject(3.3);
            objectOutputStream.flush();
        }

        try (FileInputStream fileInputStream = new FileInputStream("log.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object instanceof Integer) {
                    Integer i = Integer.valueOf(object.toString());
                    System.out.println(String.format("Integer: %d", i));
                } else if (object instanceof Long) {
                    Long l = Long.valueOf(object.toString());
                    System.out.println(String.format("Long: %d", l));
                } else if (object instanceof Double) {
                    Double d = Double.valueOf(object.toString());
                    System.out.println(String.format("Double: %1$,.1f", d));
                }
            }
        } catch (EOFException e) {
            // File end reached
        }
    }
}
