package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.exception.ZooFullException;
import tn.esprit.exception.InvalidAgeException;
import java.util.Scanner;
public class ZooManagement {
    private int nbrCages;
    private String zooName;
    public ZooManagement() {}

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public static void main(String[] args) {

        Animal lion1 = new Animal("Felidae", "Lion1", 3, true);
        Animal lion2 = new Animal("Felidae", "Lion2", 3, true);
        Animal elephant1 = new Animal("Elephantidae", "Elephant1", 8, true);
        Animal elephant2 = new Animal("Elephantidae", "Elephant2", 8, true);
        Animal giraffe1 = new Animal("Giraffidae", "Giraffe1", 5, false);
        Animal lion = new Animal();
        lion.setName("Simba");
        try {
            lion.setAge(-1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);


        Zoo zoo = new Zoo("Mon Zoo1", "Tunis");

        try {
            zoo.addAnimal(lion1);
            System.out.println("Number of animals: " + zoo.getAnimalCount());

            zoo.addAnimal(lion2);
            System.out.println("Number of animals: " + zoo.getAnimalCount());

            zoo.addAnimal(elephant1);
            System.out.println("Number of animals: " + zoo.getAnimalCount());

            zoo.addAnimal(elephant2);
            System.out.println("Number of animals: " + zoo.getAnimalCount());

            zoo.addAnimal(giraffe1);
            System.out.println("Number of animals: " + zoo.getAnimalCount());
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }


    }
}
