package c;

import i.Interface;
import l.Locator;

public class Main {

    public static void main(String[] args) {
        Locator.getList().forEach(Interface::test);
        Locator.getList2().forEach(Interface::test);
    }
}
