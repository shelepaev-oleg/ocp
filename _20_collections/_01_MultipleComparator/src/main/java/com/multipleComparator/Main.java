package com.multipleComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * #20210202_0641_234
 */
public class Main {

    public static void main(String[] args) {
        Comparator<Squirrel> c1 = new Comparator<Squirrel>() {
            @Override
            public int compare(Squirrel o1, Squirrel o2) {
                int result = o1.getSpecies().compareTo(o2.getSpecies());
                if (result != 0) return result;
                return o1.getWeight() - o2.getWeight();
            }
        };

        Comparator<Squirrel> c2 = (o1, o2) -> {
            int result = o1.getSpecies().compareTo(o2.getSpecies());
            if (result != 0) return result;
            return o1.getWeight() - o2.getWeight();
        };

        Comparator<Squirrel> c3 = (o1, o2) -> {
            Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies);
            c = c.thenComparingInt(Squirrel::getWeight);
            return c.compare(o1, o2);
        };

        Squirrel s1 = new Squirrel("2", 1);
        Squirrel s2 = new Squirrel("1", 2);
        Squirrel s3 = new Squirrel("1", 1);
        List<Squirrel> list = Arrays.asList(s1, s2, s3);

        list.sort(c3);
        System.out.println(list);
    }
}

class ChainingComparator implements Comparator<Squirrel> {
    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies);
        c = c.thenComparingInt(Squirrel::getWeight);
        return c.compare(o1, o2);
    }
}

class Squirrel {
    private String species;
    private int weight;

    public Squirrel(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
