// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AffectationHashMap a = new AffectationHashMap();
        Departement dep1 = new Departement("HR");
        Departement dep2 = new Departement("HR2");
        Employe emp1 = new Employe(1);
        a.ajouterEmployeDepartement(emp1,dep1);
        a.ajouterEmployeDepartement(emp1,dep2);///le premier ajout a été remplacé par le deuxième







    }
}