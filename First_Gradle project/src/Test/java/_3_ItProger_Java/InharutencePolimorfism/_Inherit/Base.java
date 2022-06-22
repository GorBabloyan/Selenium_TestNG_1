package _3_ItProger_Java.InharutencePolimorfism._Inherit;

public class Base {
    public static void main(String[] args) {
        Child c = new Child();
        c.p.setValue(5,2);
        System.out.println(c.p.getValue());
        c.p.add();
        c.p.sub();
        c.p.print2();
    }
}
