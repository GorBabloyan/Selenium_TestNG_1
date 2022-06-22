package _3_ItProger_Java.InharutencePolimorfism;

public class Trunks extends Transport {
    public boolean isLoaded;


    Trunks(int weight, int[] coordinates, boolean isLoaded) {
        super(weight, coordinates);
        this.isLoaded = isLoaded;
        System.out.println(getLoad());
    }

    Trunks(int weight, int[] coordinates) {
        super(weight, coordinates);
    }

    public String getLoad() {

        if (isLoaded) {
            return "Trunk is Loaded";
        } else return "Trunk is Not Loaded";

    }

    public void setLoad(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }


}
