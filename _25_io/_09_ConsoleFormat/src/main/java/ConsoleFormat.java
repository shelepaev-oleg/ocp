import java.io.Console;

/**
 * #20210408_0750_366
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class ConsoleFormat {

    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("Our zoo has 391 animals and employs 25 people.");
            console.writer().println();
            console.printf("The zoo spans 128.91 acres.");
        }
    }
}
