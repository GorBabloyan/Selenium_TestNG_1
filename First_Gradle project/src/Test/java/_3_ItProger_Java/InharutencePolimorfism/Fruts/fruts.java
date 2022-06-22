package _3_ItProger_Java.InharutencePolimorfism.Fruts;

public class fruts {
    public  int t=10;
    private String color;
    private float weight;
    private String form;

    fruts(String color, float weight, String form) {
        System.out.println("The object created \n");
        setValue(color, weight, form);
        System.out.println(getValue());
    }

    void setValue(String color, float weight, String form) {
        this.color = color;
        this.weight = weight;
        this.form = form;
    }

    String getValue() {
        return "The color is " + color + "\n" + "The weight is " + weight + "\n" + "The form is " + form + "";
    }


}
