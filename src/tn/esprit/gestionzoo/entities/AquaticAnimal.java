package tn.esprit.gestionzoo.entities;

public class AquaticAnimal extends Animal implements Herbivore<Food> {
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
    { if (this.habitat.equals(a.gethabitat()) && super.getage() == a.getage() && super.getname().equals(a.getname())) {
        return true;
    } else {
        return false;
    }
    }
    public void eatPlant(Food PLant)
    {if(PLant.equals(Food.Plant))
    {System.out.println("eats plants");}
    else
    {System.out.println("doesnt eat plants");} }
}

