package _3_ItProger_Java.Abstraction;

public class Animal_base {
    public static void main(String[] args) {
        Animal_pig pig = new Animal_pig();
        pig.animal();
        pig.animalSound();
        pig.animalWeight();

        Animal_cat cat = new Animal_cat();
        cat.animal();
        cat.animalSound();
        cat.animalWeight();
    }
}
