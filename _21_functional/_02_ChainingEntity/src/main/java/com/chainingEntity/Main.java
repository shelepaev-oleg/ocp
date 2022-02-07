package com.chainingEntity;

import java.util.Optional;

/**
 * #20210221_1533_277
 */
public class Main {

    public static void main(String[] args) {
        Address address1 = new Address(null);

        String result1 = Optional.ofNullable(address1)
                .map(Address::getCountry)
                .map(Country::getCity)
                .map(City::getName)
                .orElse(null);
        System.out.println(result1);

        City city = new City("Perm");
        Country country = new Country(city);
        Address address2 = new Address(country);

        String result2 = Optional.ofNullable(address2)
                .map(Address::getCountry)
                .map(Country::getCity)
                .map(City::getName)
                .orElse(null);
        System.out.println(result2);
    }
}

class City {
    private String name;

    public String getName() {
        return name;
    }

    public City(String name) {
        this.name = name;
    }
}
class Country {
    private City city;

    public City getCity() {
        return city;
    }

    public Country(City city) {
        this.city = city;
    }
}
class Address {
    private Country country;

    public Country getCountry() {
        return country;
    }

    public Address(Country country) {
        this.country = country;
    }
}
