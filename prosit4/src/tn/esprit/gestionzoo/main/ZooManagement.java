package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
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
        //////  Instruction 16 /////////
        Animal lion1 = new Animal("Felidae", "Lion1", 3, true);
        Animal lion2 = new Animal("Felidae", "Lion2", 3, true);

        Animal elephant1 = new Animal("Elephantidae", "Elephant1", 8, true);
        Animal elephant2 = new Animal("Elephantidae", "Elephant2", 8, true);

        Animal giraffe1 = new Animal("Giraffidae", "Giraffe1", 5, false);

        Zoo myZoo1 = new Zoo("Mon Zoo1", "Tunis");
        myZoo1.addAnimal(lion1);
        myZoo1.addAnimal(elephant1);
        myZoo1.addAnimal(giraffe1);

        Zoo myZoo2 = new Zoo("Mon Zoo2", "Tunis");
        myZoo1.addAnimal(lion2);
        myZoo1.addAnimal(elephant2);

        Zoo zoo = Zoo.comparerZoo(myZoo1, myZoo2);

        if (zoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zoo.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}
