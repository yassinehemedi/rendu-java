// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. Y
// ou can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre valide : ");
            scanner.next(); // consommer la mauvaise entrée
        }
        zooManagement.nbrCages = scanner.nextInt();

        // Nettoyer la ligne
        scanner.nextLine();

        // Demander à l'utilisateur d'entrer le nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = scanner.nextLine();

        // Afficher les informations du zoo
        zooManagement.displayZooInfo();
    }
}