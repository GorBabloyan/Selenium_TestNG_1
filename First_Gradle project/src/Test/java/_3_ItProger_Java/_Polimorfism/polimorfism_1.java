package _3_ItProger_Java._Polimorfism;

public class polimorfism_1 {
    void animal(){
        System.out.println("Animals are eat");
    }
    void animal(String name){
        System.out.println(name + " are eat");
    }
    void animal(String name, int weight){
        System.out.println(name + " are eat " + weight);
    }

    void eat(){
        System.out.println("superclass eat");
    }
}
