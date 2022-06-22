package _2_ACA_Homvork._4_1;

public class Base_Class {
    public static void main(String[] args) {
        Car track = new Track(180, "Blue", 5000, 1000);
        System.out.println("Price with weight discount for TRACK will be " + track.getSalePrice() + "$");

        Car ford = new Ford(200, "White", 3000, 300);
        System.out.println("Price with manufacturer discount for FORD will be " + ford.getSalePrice() + "$");

        Car sedan = new Sedan(240, "Red", 10000, 25);
        System.out.println("Price with length discount for SEDAN will be " + sedan.getSalePrice() + "$");
    }
}
