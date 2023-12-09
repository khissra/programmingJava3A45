import java.util.Objects;

public class departement implements Comparable<departement> {
    private int id ;
   private  String nom;
   private int nbEmployees;

    public departement() {
    }

    public departement(int id, String nom, int nbEmployees) {
        this.id = id;
        this.nom = nom;
        this.nbEmployees = nbEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        departement that = (departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployees=" + nbEmployees +
                '}';
    }
    @Override
    public int compareTo(departement o) {
        return Integer.compare(this.id, o.id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }


}
