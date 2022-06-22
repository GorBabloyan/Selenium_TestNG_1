package _3_ItProger_Java.InharutencePolimorfism._Inherit;

public abstract class Parent implements interface_1_1 {
    @Override
    public void add() {
        System.out.println("implement");
    }

    @Override
    public abstract void sub() ;

    int i = 5;
    int j = 10;
    void setValue(int i, int j){
        this.i = i;
        this.j = j;
    }
    int getValue(){
        return  i + j;
    }

    abstract void chang();


}
