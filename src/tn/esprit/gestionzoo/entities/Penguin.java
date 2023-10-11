package tn.esprit.gestionzoo.entities;
public class Penguin extends AquaticAnimal {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getters et setters spécifiques pour la profondeur de nage
}