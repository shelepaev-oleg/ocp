package com.pecs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * #20210531_0531_dev_79
 * https://habr.com/ru/post/207360/
 * https://www.youtube.com/watch?v=EgOZSr-Uc3w&ab_channel=JUG.ru
 */
public class Pecs {

    public static void main(String[] args) {
        ObjectStore<Long, Car> carsStore = new ObjectStoreImpl<>();
        carsStore.put(20334L, new Car("BMW", "X5", 2013));
        Car c = carsStore.get(20334L);
        System.out.println(c);

        // Потребитель
        Predicate<Vehicle> p = vehicle -> Objects.equals("BMW", vehicle.getMark());
        Collection<Car> cars = carsStore.getAll(p);
        System.out.println(cars);

        // Производитель
        ObjectStore<Long, Vehicle> vehicleStore = new ObjectStoreImpl<>();
        Map<Long, Car> vehicles = new HashMap<>(2);
        vehicles.put(1L, new Car("Audi", "A6", 2011));
        vehicles.put(2L, new Car("Honda", "Civic", 2012));
        vehicleStore.putAll(vehicles);

        Predicate<Vehicle> predicate2 = vehicle -> Objects.equals("Audi", vehicle.getMark());
        Collection<Vehicle> vs = vehicleStore.getAll(predicate2);
        System.out.println(vs);
    }
}
