package com.PropertyTest;

import java.util.Properties;

/**
 * 20210320_0802_302
 */
public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("veggies", "brontosaurus");
        properties.put("meat", "velociraptor");

//        System.out.println(properties.getOrDefault("1", "none"));
//        System.out.println(properties.getProperty("2", "none"));
//        System.out.println(properties.getProperty("veggies"));

        properties.keySet().stream().map(k -> properties.get(k)).forEach(System.out::println);
    }
}
