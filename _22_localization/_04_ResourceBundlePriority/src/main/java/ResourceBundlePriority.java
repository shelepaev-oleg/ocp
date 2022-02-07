import java.util.Locale;
import java.util.ResourceBundle;

/**
 * #20210312_0818_305
 * Запустить как отдельный проект!
 */
public class ResourceBundlePriority {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("hi"));
        System.out.println(rb.getString("hello"));
    }
}
