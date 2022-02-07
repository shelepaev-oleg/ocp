import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * #20210406_0803_353
 */
public class BufferedInputStreamTest {

    public static void main(String[] args) throws IOException {
        URL source = BufferedInputStreamTest.class.getClassLoader().getResource("input.txt");
        copy(source.getPath(), "C:\\Users\\57ShelepaevOA\\Desktop\\test.txt");

        // Пишет в файл
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\57ShelepaevOA\\Desktop\\test.txt", true);
//        String greetings = "Привет!";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();
    }

    private static void copy (String source, String destination) {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte [] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                System.out.println(lengthRead);
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
