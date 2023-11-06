package tn.esprit.gestionzoo.entities;

public class TerrestrialAnimal extends Animal implements Carnivore<Food> {
    private int nbrLegs;

    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getters et setters spécifiques pour le nombre de pattes
    public String toString() {
        return super.toString() + nbrLegs;
    }
    public void eatMeat(Food meat)
    {if(meat.equals(Food.Plant))
    {System.out.println("eats meat");}
    else
    {System.out.println("doesnt eat meat");} }
}
