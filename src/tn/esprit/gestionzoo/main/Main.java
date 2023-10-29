package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création de plusieurs animaux en utilisant le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        lion.displayAnimal();
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal snake = new Animal("Serpentidae", "Snake", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25);

        // Affectation des animaux au zoo


        boolean ajout1 = myZoo.addAnimal(lion); // Ajout réussi (retourne true) sinon false
        boolean ajout2 = myZoo.addAnimal(elephant); // Ajout réussi (retourne true) sinon false
        boolean ajout3 = myZoo.addAnimal(snake); // Ajout réussi (retourne true) sinon false

        int n = myZoo.searchAnimal(lion);
        System.out.println(n);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        boolean ajout4 = myZoo.addAnimal(lion2); // Ajout réussi (retourne true) sinon false
        int result2 = myZoo.searchAnimal(lion2);
        System.out.println("Résultat 2 : " + result2);//n=resultat2  deux lion ont été ajouté mais lorsque on cherche l occurence du premier lion affichera

        Animal lion3 = new Animal("Felidae", "Lion", 5, true);
        boolean ajout5 = myZoo.addAnimalUnique(lion3); // retourne  false lion existe deja

        boolean suppressionReussie = myZoo.removeAnimal(lion);// retourne true


        Zoo zoo1 = new Zoo("Mon Zoo1", "Ma Ville1", 25);
        Zoo zoo2 = new Zoo("Mon Zoo2", "Ma Ville2", 25);

// Ajoutez des animaux aux zoos...

        Zoo z = zoo1.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + z.getName());


        System.out.println(myZoo.isZooFull());


    }
}
