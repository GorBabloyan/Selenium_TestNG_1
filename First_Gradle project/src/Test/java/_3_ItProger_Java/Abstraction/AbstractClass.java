package _3_ItProger_Java.Abstraction;

public abstract class AbstractClass {

    public abstract String name();
    public abstract void eat();
    public abstract void run();
    public void display(){
        System.out.println(name() + "  can eat and run");
    }
}
