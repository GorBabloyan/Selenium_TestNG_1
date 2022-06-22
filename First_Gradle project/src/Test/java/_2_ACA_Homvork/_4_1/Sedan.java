package _2_ACA_Homvork._4_1;

public class Sedan extends Car {
    private int length;
    Sedan(int speed, String color, double regularPrice, int length) {
        super(speed, color, regularPrice);
        this.length = length;
    }
    double getSalePrice() {
        double price = super.getSalePrice();
        if (length > 20) {
            price = price - price / 100 * 5;
        } else {
            price = price - price / 100 * 10;
        }

        return price;
    }
}
