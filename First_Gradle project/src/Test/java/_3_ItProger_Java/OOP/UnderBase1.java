package _3_ItProger_Java.OOP;

public class UnderBase1 {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public UnderBase1(float speed, int weight, String color, byte[] coordinates){
        this.setValue(speed, weight, color, coordinates);
        System.out.println(this.getValue());
    }

    public void setValue(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getValue() {
        String info = "Speed : " + speed + " Weight: " + weight + " Color: " + color;
        String coordinate = "";
        for (int i = 0; i < coordinates.length; i++)
            coordinate += coordinates[i] + "  ";
        return info + "\n" + " Coordinates are \n " + coordinate;
    }


}
