class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Is Mammal: " + isMammal);
    }
}

class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        if(nbrCages>25)
        this.nbrCages = 25;
        else {
            this.nbrCages = nbrCages;
        }
    }
    public boolean addAnimal(Animal animal) {
        for(int i=0;i<this.nbrCages;i++){
            if(animals[i]==null)
            {animals[i]=animal;
                return true;}
        }
        return false;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public void displayAnimals() {
        for(int i=0;i<this.nbrCages;i++){
            animals[i].displayAnimal();
        }


    }
    int searchAnimal(Animal animal){
        for(int i=0;(i<this.nbrCages);i++)
        {if(animals[i]==animal)
            return i;}
        return -1;
    }
    public boolean addAnimalUnique(Animal animal) {
        if(searchAnimal(animal)==-1) return addAnimal(animal);
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        if(searchAnimal(animal)!=-1){
            animals[searchAnimal(animal)]=null;
            return true;
        }
        return false;
    }
    public boolean isZooFull(){
        int nbranimal=0;
        for(int i=0;(i<this.nbrCages);i++)
        {if(animals[i]!=null)
        {nbranimal=+1;}}
if(this.nbrCages==nbranimal) {
    return true;
}
    return false;

    }
    public int nbranimal1(Zoo z){
        int nbranimal=0;
        for(int i=0;(i<this.nbrCages);i++)
        {if(animals[i]!=null)
        {nbranimal=+1;}}
        return nbranimal;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {if(nbranimal1(z1)>nbranimal1(z2))
    {return z2;}
        else if(nbranimal1(z1)<nbranimal1(z2))
    {return z1;}



}
}



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
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = snake;
        myZoo.animals[3] = dolphin;
        myZoo.displayZoo();


        System.out.println(myZoo);        // Nom du zoo : Mon Zoo Ville du zoo : Ma Ville Nombre de cages : 25
        System.out.println(myZoo.toString());//YourPackageName.Zoo@3e25a5  u need to override the function


        boolean ajout1 = myZoo.addAnimal(lion); // Ajout réussi (retourne true) sinon false
        boolean ajout2 = myZoo.addAnimal(elephant); // Ajout réussi (retourne true) sinon false
        boolean ajout3 = myZoo.addAnimal(snake); // Ajout réussi (retourne true) sinon false

        int n= myZoo.searchAnimal(lion);
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
        System.out.println("Le zoo avec le plus d'animaux est : " + z.name);


        System.out.println( myZoo.isZooFull());



    }
}