import java.io.Console;

/**
 * #20210409_0638_367
 * Запустить получиться из CMD, для idea нужны пляски с бубном
 */
public class ConsolePasswordTest {

    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            char [] password = console.readPassword("Enter your password: ");

            System.out.println(password.length);

            // Вывод пароля на экран
            for (int i = 0; i < password.length; i++) {
                console.writer().print(password[i]);
            }

            // Стирание пароля из памяти
            for (int i = 0; i < password.length; i++) {
                password[i] = '*';
            }

            console.flush();
            console.writer().println();

            // Вывод пароля на экран
            for (int i = 0; i < password.length; i++) {
                console.writer().print(password[i]);
            }

            console.flush();
            console.writer().println();

            char [] test = {'x', 'y', 'z'};
            for (int i = 0; i < test.length; i++) {
                console.writer().print(test[i]);
            }

            console.flush();
            console.writer().println();

//            Array.fill(password, '^');
        }
    }
}
