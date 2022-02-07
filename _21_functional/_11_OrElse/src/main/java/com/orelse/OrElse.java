package com.orelse;

import java.util.Optional;

/**
 * #20210910_0733_276
 */
public class OrElse {

    public static void main(String[] args) {
        User user = User.getInstance();
        System.out.println(user);
    }
}

class User {

    private static User user = new User();

    public static User getInstance() {
//        return Optional.ofNullable(user).orElseGet(() -> create());
        return Optional.ofNullable(user).orElse(create()); // вызовет метод create даже если не просили
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private static User create() {
        System.out.println("Create!");
        user = new User();
        return user;
    }
}
