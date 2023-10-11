package tn.esprit.gestionzoo.entities;

public class TerrestrialAnimal extends Animal {
    private int nbrLegs;

    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getters et setters spécifiques pour le nombre de pattes
    public String toString() {
        return super.toString() + nbrLegs;
    }
}
