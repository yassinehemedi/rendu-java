package tn.esprit.gestionzoo.entities;

public abstract class Dolphin extends AquaticAnimal {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }


     public abstract  void swim() ;

}
