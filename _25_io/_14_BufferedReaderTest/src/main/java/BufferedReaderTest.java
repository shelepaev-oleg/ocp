import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * #20210410_0630_354
 */
public class BufferedReaderTest {

    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("log.text");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
