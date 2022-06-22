package _3_ItProger_Java.Abstraction;

public class Animal_pig extends Animal_abstract{
    @Override
    public void animalSound() {
        System.out.println("Pig say wo wo");
    }

    @Override
    public void animalWeight() {
        System.out.println(" maybe 100 kg ");
    }

    @Override
    public void animal() {
        super.animal();
    }
}
