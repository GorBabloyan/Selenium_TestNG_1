package _3_ItProger_Java.Enums;

enum EnumVariables {
    LOW,
    MIDDLE,
    HIGH
}
public class Enums{
    public static void main(String[] args) {
//        EnumVariables low = EnumVariables.LOW;
//        EnumVariables mid = EnumVariables.MIDDLE;
//        EnumVariables high = EnumVariables.HIGH;
//        System.out.println(low );
        EnumVariables[] en = EnumVariables.values();
        for (EnumVariables e : en){
            System.out.println(e);
        }



    }

}