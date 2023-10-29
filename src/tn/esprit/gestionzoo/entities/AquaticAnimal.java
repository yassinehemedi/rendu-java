package tn.esprit.gestionzoo.entities;

public class AquaticAnimal extends Animal {
    private String habitat;

    public String gethabitat() {
        return habitat;
    }

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
    public boolean equals(AquaticAnimal a)
    { if((this.habitat==a.gethabitat())&&(super.getage()==a.getage())&&(super.getname()==a.getname()))
        return true;
        else return false;


    }
}
