package _3_ItProger_Java.InharutencePolimorfism.Fruts;

public class Base_Polimorfism extends Polimorfism {
    int a;
    int b;

    public void setValue(int a,  int c){

        System.out.println("Base set value");
    }
    @Override
    public void setValue(int a, int b, int c) {
        super.setValue(a, b, c);
        System.out.println("Overrided code");
    }

    public static void main(String[] args){
        Polimorfism p1 = new Base_Polimorfism();
        Base_Polimorfism p = new Base_Polimorfism();
        p.setValue(1,2);
        p1.setValue(1,2,3);
    }
}
