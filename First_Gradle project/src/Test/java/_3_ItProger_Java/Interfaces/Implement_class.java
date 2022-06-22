package _3_ItProger_Java.Interfaces;

public class Implement_class implements interface_1, Interfaces_2{
    @Override
    public void in3() {
        System.out.println("in3");
    }

    @Override
    public String in4() {
        String name = "Gor";
        return name + " in4";
    }

    @Override
    public void in1() {
        System.out.println("in1");
    }

    @Override
    public void in2() {
        System.out.println("in2");
    }
}
