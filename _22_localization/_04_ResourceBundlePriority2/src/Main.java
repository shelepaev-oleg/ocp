import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 20210317_0849_304/1
 * Запустить как отдельный проект!
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
//        Locale.setDefault(new Locale("en", "US"));

        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("fr"));
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("surname"));
    }
}
