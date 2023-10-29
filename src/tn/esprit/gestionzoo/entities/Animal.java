package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Is Mammal: " + isMammal);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            // Vous pouvez gérer l'erreur ici, par exemple, afficher un message ou lancer une exception.
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    public int getage() {
        return age;
    }
}
