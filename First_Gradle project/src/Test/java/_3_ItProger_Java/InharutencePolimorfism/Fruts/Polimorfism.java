package _3_ItProger_Java.InharutencePolimorfism.Fruts;

public class Polimorfism {
    private int a;
    private int b;
    private int c;

    public void setValue(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(getValue());
    }

    public int getValue() {
        this.c = this.a + this.b;
        return c;
    }
}
