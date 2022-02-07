package com.enummethod;

/**
 * #20211019_0729_326
 */
public class EnumMethod {

    public static void main(String... __) {
        Season season = Season.WINTER;
        System.out.println(season.getHours());

        Season2 season2 = Season2.SUMMER;
        System.out.println(season2.getHours());
    }
}

enum Season {
    WINTER {
        String getHours() { return "10am-3pm"; }
    };
    abstract String getHours();
}

enum Season2 {
    WINTER {
        String getHours() { return "10am-3pm"; }
    },
    SUMMER;
    String getHours() { return "9am-5pm"; }
}
