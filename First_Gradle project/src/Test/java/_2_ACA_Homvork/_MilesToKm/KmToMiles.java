package _2_ACA_Homvork._MilesToKm;
//1km = 1.609344mile
public class KmToMiles {
    private int km;
    private int mile;

    void kmMile(){
        System.out.println("Km  " + "Mile");
        for (int i = 10; i<=110; i+=10){
            this.km+=10;
            this.mile = (int) (1.6*this.km);
            System.out.println(km + "  " + mile + "  ");
        }
    }


}
