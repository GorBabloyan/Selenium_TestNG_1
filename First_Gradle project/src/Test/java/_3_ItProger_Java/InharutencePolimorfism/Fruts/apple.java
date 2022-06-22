package _3_ItProger_Java.InharutencePolimorfism.Fruts;

public class apple extends fruts{
    private boolean kut ;

    apple(String color, float weight, String form, boolean kut){
        super(color,weight,form);
        this.kut =kut;
        print();
    }

    void setKut(boolean kut){

        this.kut = kut;
    }
    boolean getKut(){

        return kut;
    }

    void print(){
        System.out.println(getKut() + "\n");

    }

}
