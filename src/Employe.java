import java.util.Comparator;

public class Employe implements Comparable<Employe> {
    // Attributs
    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    // Constructeurs
    public Employe() {
        // Constructeur sans paramètre
    }

    public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    // Getters & Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Redéfinition de la méthode equals

    public boolean equals(Employe e) {

        return identifiant == e.getIdentifiant() && nom.equals(e.getNom());
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public int compareTo(Employe autreEmploye) {
        return this.getIdentifiant()- autreEmploye.getIdentifiant();
    }




}
