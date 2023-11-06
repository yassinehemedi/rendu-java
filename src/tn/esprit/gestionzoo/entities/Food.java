package tn.esprit.gestionzoo.entities;

interface Herbivore<T>
{void eatPlant(T plant);

}
interface Carnivore<T>
{void eatMeat(T meat);

}

public enum Food {Meat,Plant,Both}
