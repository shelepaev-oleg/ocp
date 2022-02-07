import java.io.Console;

/**
 * #20210408_0750_365
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class ConsoleTest {

    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println(userInput);
        }
    }
}
