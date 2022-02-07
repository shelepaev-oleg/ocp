import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * #20210409_0758_359
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class PrintTest {

    public static void main(String[] args) throws IOException {
        System.out.println("out");
        System.err.println("err");

        PrintStream printOut = new PrintStream(new FileOutputStream("log.text"));
        System.setOut(printOut);
        System.setErr(printOut);

        System.out.println("out");
        System.err.println("err");

        System.out.flush();
        System.err.flush();
    }
}
