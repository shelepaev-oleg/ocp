import java.util.ListResourceBundle;

public class _Zoo_hi extends ListResourceBundle {

    /**
     * Returns an array in which each item is a pair of objects in an
     * <code>Object</code> array. The first element of each pair is
     * the key, which must be a <code>String</code>, and the second
     * element is the value associated with that key.  See the class
     * description for details.
     *
     * @return an array of an <code>Object</code> array representing a
     * key-value pair.
     */
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    private final Object[][] contents = {
            { "hello", "1" },
    };
}
