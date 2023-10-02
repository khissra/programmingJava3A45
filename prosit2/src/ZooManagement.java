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
        Zoo myZoo = new Zoo("Mon Zoo", "Tunis", 3);

        Animal lion1 = new Animal("Felidae", "Lion", 3, true);
        myZoo.addAnimal(lion1);

        Animal lion2 = new Animal("Felidae", "Lion", 3, true);
        myZoo.addAnimal(lion2);

        int indice1 = myZoo.searchAnimal(lion1);
        int indice2 = myZoo.searchAnimal(lion2);

        System.out.println("Indice du 1 lion trouvé : " + indice1);
        System.out.println("Indice du 2 lion trouvé : " + indice2);
    }
}
