public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur sans paramètre
    public Departement() {
        // Initialisation par défaut ou laissé vide selon les besoins
    }

    // Constructeur avec paramètres
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement D)) return false;
        return id == D.getId() && nomDepartement.equals(D.getNomDepartement());
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    // Getters et setters (selon les besoins)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    public int compareTo(Departement D)
    {return id-D.getId();}

}
