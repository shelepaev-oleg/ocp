package transienttest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * #20210407_0745_357
 */
public class TransientTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Tommy Tiger",5,'T'));
        animalList.add(new Animal("Peter Penguin",8,'P'));
        File dataFile = new File("Animal2.data");
        createAnimal2sFile(animalList,dataFile);
        System.out.println(getAnimal2s(dataFile));
    }

    public static List<Animal> getAnimal2s(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal> animalList = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal)
                    animalList.add((Animal) object);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return animalList;
    }

    public static void createAnimal2sFile(List<Animal> animalList, File dataFile)
            throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal animal: animalList)
                out.writeObject(animal);
        }
    }
}

class Animal implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';
    {this.age = 14;}
    public Animal() {
        this.name = "Name";
    }
    public Animal(String name, int age, char type) {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public char getType() { return type; }
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}
