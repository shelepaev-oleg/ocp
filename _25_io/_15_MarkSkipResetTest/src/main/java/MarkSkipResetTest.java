import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * #20210410_0745_350/1
 */
public class MarkSkipResetTest {

    public static void main(String[] args) throws IOException {
        URL s = MarkSkipResetTest.class.getClassLoader().getResource("log.txt"); // XYZABC
        FileInputStream f = new FileInputStream(s.getPath());
        BufferedInputStream b = new BufferedInputStream(f);
        String r = pullBytes(b, 3);
        System.out.println(r);
    }

    public static String pullBytes(InputStream is, int count) throws IOException {
        is.mark(count); // это бсполезная установка, т.к. mark можно установить только на том символе, который прочитал
        final StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append((char) is.read());
//            is.mark(i);
        }
        is.reset();
        is.skip(1);
        sb.append((char)is.read());
        return sb.toString();
    }
}
