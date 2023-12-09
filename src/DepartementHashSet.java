import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement {
    private Set<departement> depSet = new HashSet<>();
    @Override
    public void ajouterDepartement(Object o) {
        if (o.getClass()==departement.class){
         depSet.add((departement) o);
         System.out.println("département ajouté avec succes");
    }
    else {
            System.out.println("l objet n est pas un departement");
    }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (departement department : depSet) {
            if (department.getNom().equals(nom)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean rechercherDepartement(Object o) {
        return depSet.contains((departement) o);
    }

    @Override
    public void supprimerDepartement(Object o) {
        depSet.remove((departement)o);
    }

    @Override
    public void displayDepartement() {
        Iterator<departement> iterator = depSet.iterator();
        while (iterator.hasNext()) {
            departement element = iterator.next();
            System.out.println(element);
        }
    }

    @Override
    public TreeSet trierDepartementById() {
        return new TreeSet<>(depSet);
    }
}
