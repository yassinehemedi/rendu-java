package tn.esprit.gestionzoo.entities;

public class AquaticAnimal extends Animal {
    private String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Getters et setters spécifiques pour l'habitat
    public String toString() {
        return super.toString() +  habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
