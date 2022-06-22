package _3_ItProger_Java.Abstraction;public class Base {
    public static void main(String[]args){
        Child c = new Child();
        parent p = new Child();
        c.name = "Gor";
        System.out.println(c.name());
        c.eat();
        c.run();
        c.display();
        //p.display();

    }
}
