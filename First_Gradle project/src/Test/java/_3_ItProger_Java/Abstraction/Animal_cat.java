package _3_ItProger_Java.Abstraction;

public class Animal_cat extends Animal_abstract{
    @Override
    public void animalSound() {
        System.out.println("Cat says myau myau");
    }

    @Override
    public void animalWeight() {
        System.out.println("meybe about 30kg");
    }

    @Override
    public void animal() {
        super.animal();
    }
}
