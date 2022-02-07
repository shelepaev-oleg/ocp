/**
 * #20210608_0619_424/1
 */
public class TestClone implements Cloneable {

    private int i = 1;

    public int getI() {
        return i;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone a = new TestClone();
        System.out.println(a);

        TestClone b = (TestClone) a.clone();
        System.out.println(b);
        System.out.println(b.getI());
    }
}
