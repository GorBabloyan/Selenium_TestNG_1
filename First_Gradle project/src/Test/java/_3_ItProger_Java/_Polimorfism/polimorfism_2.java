package _3_ItProger_Java._Polimorfism;

public class polimorfism_2 extends polimorfism_1{

    @Override
    void animal(){
        super.animal();
        System.out.println("1 There it much");
    }
    @Override
    void animal(String name){
        super.animal(name);
        System.out.println("2 Dogs are eat meal");
    }
    @Override
    void animal(String name, int weight){
        super.animal(name,weight);
        System.out.println("3 cats are same");
    }
    void eat(){
        System.out.println("child class eat");
    }
}
