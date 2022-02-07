package writertest;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * #20210409_0700_367
 * Запустить получиться из CMD
 *
 * javac writertest/WriterTest.java
 * java writertest/WriterTest
 */
public class WriterTest {

    public static void main(String[] args) throws IOException {
        String line;
        Console c = System.console();
        if (c != null) {
            Writer w = c.writer();
            if ((line = c.readLine("Enter your name: ")) != null)
                w.append(line);
            w.flush();
        }
    }
}
