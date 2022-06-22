package _3_ItProger_Java.InharutencePolimorfism;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private int[] coordinates;

    Transport(float speed, int weight, String color, int[] coordinates) {
        setValue(speed, weight, color, coordinates);
        System.out.println(getValue());
    }

    Transport(int weight, int[] coordinates) {
        this.weight = weight;
        this.coordinates = coordinates;
        System.out.println(getValue());
    }

    void setValue(float speed, int weight, String color, int[] coordinates) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.coordinates = coordinates;
    }

    String getValue() {
        String arrElement = "";
        for (int i = 0; i < coordinates.length; i++) {
            arrElement += coordinates[i] + "\n";
        }
        String value = color + " " + speed + " " + weight + "\n" + arrElement;
        return value;
    }


}
