package _2_ACA_Homvork._4_1;

public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    Ford(int speed, String color, double regularPrice, int manufacturerDiscount) {
        super(speed, color, regularPrice);
        this.manufacturerDiscount = manufacturerDiscount;
    }

    double getSalePrice() {
        double price = super.getSalePrice();
        return price - manufacturerDiscount;
    }

}
