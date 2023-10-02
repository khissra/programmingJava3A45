public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;


    public Zoo(String name, String city, int nbrCages ) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return false;
            }
        }
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println("Cage " + (i + 1) + ": " + animals[i]);
            } else {
                System.out.println("Cage " + (i + 1) + ": Vide");
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages : " + nbrCages;
    }

}
