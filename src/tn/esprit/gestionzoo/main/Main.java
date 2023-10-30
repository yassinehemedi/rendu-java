package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.AquaticAnimal;
import tn.esprit.gestionzoo.entities.TerrestrialAnimal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.InvalidAgeException;



public class Main {
    public static void main(String[] args) {
        // Création de plusieurs animaux en utilisant le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        lion.displayAnimal();
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal snake = new Animal("Serpentidae", "Snake", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Dolphin", 8, true);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25,10);

        // Affectation des animaux au zoo


        try {
            myZoo.addAnimal(lion);
        }catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }
        catch (ZooFullException e) {
            System.out.println( e.getMessage());
        }
        finally{
            myZoo.nbranimal1(myZoo);
        }
        // Ajout réussi (retourne true) sinon false
        try {
            myZoo.addAnimal(elephant);
        } catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }
        catch (ZooFullException e) {
            System.out.println( e.getMessage());
        }
        finally{
            myZoo.nbranimal1(myZoo);
        }
        try {
            myZoo.addAnimal(snake);
        } catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }
        catch (ZooFullException e) {
            System.out.println( e.getMessage());
        }
        finally{
            myZoo.nbranimal1(myZoo);
        }

        int n = myZoo.searchAnimal(lion);
        System.out.println(n);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        try {
            myZoo.addAnimal(lion2);
        } catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }
        catch (ZooFullException e) {
            System.out.println( e.getMessage());
        }
        finally{
            myZoo.nbranimal1(myZoo);
        }

        int result2 = myZoo.searchAnimal(lion2);
        System.out.println("Résultat 2 : " + result2);//n=resultat2  deux lion ont été ajouté mais lorsque on cherche l occurence du premier lion affichera

        Animal lion3 = new Animal("Felidae", "Lion", 5, true);
        try {
            myZoo.addAnimalUnique(lion3);         }catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }
        catch (ZooFullException e) {
            System.out.println( e.getMessage());
        }
        finally{
            myZoo.nbranimal1(myZoo);
        }// retourne  false lion existe deja

        boolean suppressionReussie = myZoo.removeAnimal(lion);// retourne true


        Zoo zoo1 = new Zoo("Mon Zoo1", "Ma Ville1", 25,10);
        Zoo zoo2 = new Zoo("Mon Zoo2", "Ma Ville2", 25,10);

// Ajoutez des animaux aux zoos...

        Zoo z = zoo1.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + z.getName());


        System.out.println(myZoo.isZooFull());

        AquaticAnimal aquaticAnimal = new AquaticAnimal("Aquatic Mammal", "Aquatic Animal", 10, true, "Ocean");
        AquaticAnimal aquaticAnimal1 = new AquaticAnimal("Mammal", " Animal", 10, true, "Ocean");

        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal("Terrestrial Animal", "Terrestrial Animal", 8, true, 4);
        Penguin penguin = new Penguin("Penguin Family", "Penguin", 7, true, "Antarctica", 25);

        System.out.println( lion.toString() );
        System.out.println( terrestrialAnimal.toString() );
        System.out.println( aquaticAnimal.toString() );


        aquaticAnimal.swim();//This aquatic animal is swimming
        penguin.swim();//  This aquatic animal is swimming.


        zoo1.addAquaticAnimal(aquaticAnimal);
        zoo1.swim();

        aquaticAnimal.equals(aquaticAnimal1);







    }
}
