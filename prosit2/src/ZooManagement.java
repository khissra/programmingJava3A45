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

        Animal lion = new Animal();
        lion.setFamily("Felidae");
        lion.setName("Lion");
        lion.setAge(3);
        lion.setMammal(true);


        /////////////Instruction 5/////////////
       /* Zoo myZoo = new Zoo();
          myZoo.setName("Mon Zoo");
          myZoo.setCity("Tunis");
          myZoo.setNbrCages(25);
        System.out.println("Animal : " + lion.getName() + ", Age : " +
                lion.getAge());
        System.out.println("Zoo : " + myZoo.getName() + ", Ville : " +
                myZoo.getCity());*/



            //////////Instruction 7////////
        /*Animal lion = new Animal("Felidae","Lion",3,true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 8, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 5, false);
        Animal[] animals = new Animal[25];
        animals[0] = lion;
        animals[1] = elephant;
        animals[2] = giraffe;
        Zoo myZoo = new Zoo("Mon Zoo", "Tunis", 10, animals); */


        //////Instruction 8////////
       /* System.out.println("displayZoo : ");
        myZoo.displayZoo();
        System.out.println("myZoo : ");
        System.out.println(myZoo);
        System.out.println("myZoo.toString : ");
        System.out.println(myZoo.toString());*/

        //////Instruction 10////////
       /* Animal lion= new Animal("Felidae","Lion",3,true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 8, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 5, false);
        Zoo myZoo = new Zoo("Mon Zoo", "Tunis",2);
        boolean ajout1 = myZoo.addAnimal(lion);
        boolean ajout2 = myZoo.addAnimal(elephant);
        boolean ajout3 = myZoo.addAnimal(giraffe);
        System.out.println("Ajout 1 : " + ajout1);
        System.out.println("Ajout 2 : " + ajout2);
        System.out.println("Ajout 3 : " + ajout3);
        myZoo.displayAnimals();
        int indice = myZoo.searchAnimal(lion);
        System.out.println("Indice de l'animal trouvé : " + indice);*/


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
