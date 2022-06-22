package _2_ACA_Homvork._4_1;

public class Car {
    private int speed;
    private String color;
    private double regularPrice;

    Car(int speed, String color, double regularPrice) {
        this.speed = speed;
        this.color = color;
        this.regularPrice = regularPrice;
    }

    double getSalePrice() {
        return regularPrice;
    }
}
