package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name ;
    private String city;
    private final int nbrCages;
    private AquaticAnimal[] A;
    private int tailleA;

    public Zoo(String name, String city, int nbrCages,int a) {
        tailleA=a;
        A=new AquaticAnimal[a];
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;
        if(nbrCages>25) {
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }
    }

    public String getName() {
        return name;
    }
    public int getNbrCages() {
        return nbrCages;
    }
    public void setName(String name) {
        if (name != null ) this.name = name;
        else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }
    public boolean addAnimal(Animal animal) {
        if(!isZooFull())
        {for (int i = 0; i < this.nbrCages; i++)
                if (animals[i] == null) {
                    animals[i] = animal;
                    return true;
                }}
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
    public int searchAnimal(Animal animal){
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
        for(int i=0;(i<z.getNbrCages());i++)
        {if(animals[i]!=null)
        {nbranimal=+1;}}
        return nbranimal;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {if(nbranimal1(z1)>nbranimal1(z2))
    {return z2;}
    else
        return z1;

    }
    public void addAquaticAnimal(AquaticAnimal aquatic)
    {if(A.length!=tailleA)
    {A[A.length]=aquatic;}}


    public void swim()
    {for(AquaticAnimal a:A)
    {a.swim();}}

    public float maxPenguinSwimmingDepth()
    {float max=0;
        for(AquaticAnimal a:A)
    {if(a instanceof Penguin p)
    {if(p.getSwimmingDepth()>=max)
    max=((Penguin) a).getSwimmingDepth();}}
        return max; }

    public void displayNumberOfAquaticsByType()
    {int p=0, d=0;
        for(AquaticAnimal a:A)
        {if(a instanceof Dolphin)
        d=d+1;
        else if(a instanceof Penguin )
        p=p+1;}
       }

}



