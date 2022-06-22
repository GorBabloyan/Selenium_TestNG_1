package _2_ACA_Homvork._4_1;


public class Track extends Car {
    private int weight;
    Track(int speed, String color, double regularPrice, int weight) {
        super(speed, color, regularPrice);
        this.weight = weight;
    }
    double getSalePrice() {
        double price = Track.super.getSalePrice();
        if (weight > 2000) {
            price = price - price / 100 * 10;
        } else {
            price = price - price / 100 * 20;
        }
        return price;
    }
}
