import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

/**
 * #20210409_0613_366
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class ConsoleReadInputSample {

    public static void main(String[] args) throws IOException {
        Console console = System.console();
        if(console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().print("How excited are you about your trip today? ");
            console.flush();
            String excitementAnswer = console.readLine();
            String name = console.readLine("Please enter your name: ");
            Integer age = null;
            console.writer().print("What is your age? ");
            console.flush();
            BufferedReader reader = new BufferedReader(console.reader());
            String value = reader.readLine();
            age = Integer.valueOf(value);
            console.writer().println();
            console.format("Your name is %s", name);
            console.writer().println();
            console.format("Your age is " + age);
            console.printf("Your excitement level is: "+excitementAnswer);
        }
    }
}
