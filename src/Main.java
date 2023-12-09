import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet manager = new DepartementHashSet();

        departement dep4=new departement(4,"DEVCO", 4);
        departement dep1 =new departement(1,"IT", 1);
        departement dep2=new departement(2,"Finance", 2);
        departement dep3=new departement(3,"HR", 3);
        manager.ajouterDepartement(dep4);
        manager.ajouterDepartement(dep1);
        manager.ajouterDepartement(dep2);
        manager.ajouterDepartement(dep3);

        manager.displayDepartement();

        boolean foundByName = manager.rechercherDepartement("IT");
        System.out.println("département trouvé par nom : " + foundByName);


        boolean foundByInstance = manager.rechercherDepartement(dep1);
        System.out.println("département trouvé par instance : " + foundByInstance);

        manager.supprimerDepartement(dep1);
        manager.displayDepartement();

        TreeSet<departement> sortedDepartments = manager.trierDepartementById();
        System.out.println("départements triés par id : " + sortedDepartments);
    }

}