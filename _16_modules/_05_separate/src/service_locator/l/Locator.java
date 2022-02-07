package l;

import i.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Locator {

    public static List<Interface> getList() {
        List<Interface> result = new ArrayList<>();
        ServiceLoader<Interface> loader = ServiceLoader.load(Interface.class);
        for (Interface i : loader) {
            result.add(i);
        }
        return result;
    }

    public static List<Interface> getList2() {
        return ServiceLoader.load(Interface.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
