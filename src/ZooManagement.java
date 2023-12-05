public class ZooManagement {

    // Déclaration des variables
   public int nbrCages = 20; // initialisé à 20
    public String zooName = "my zoo"; // initialisé à "my zoo"

    // Constructeur par défaut
    public ZooManagement() {
    }

    // Méthode pour afficher le message avec les variables
    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }}