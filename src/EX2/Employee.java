package EX2;

public class Employee {
    private String nom;
    private String departement;
    private double salaire;

    public Employee() {
    }

    public Employee(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return nom +  " , departement:'" + departement + '\'' +
                ", salaire:" + salaire;
    }
}
