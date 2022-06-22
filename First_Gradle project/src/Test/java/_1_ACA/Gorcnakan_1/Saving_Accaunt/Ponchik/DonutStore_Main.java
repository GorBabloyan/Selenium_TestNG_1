package _1_ACA.Gorcnakan_1.Saving_Accaunt.Ponchik;

public class DonutStore_Main {
    public static void main(String[] args) throws InterruptedException {

        Store s1 = new Store();
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice() + "\n");


        System.out.println("Buyer 1");                      //Everything OK Input Price = Price
        s1.seller(5,5,5);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        System.out.println();
        Thread.sleep(2000);


        System.out.println("Buyer 1");                      //Everything OK  Input Price > Price
        s1.seller(1,1,1);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        System.out.println();
        Thread.sleep(2000);

        System.out.println("Buyer 2");                      //Not enough donut
        s1.seller(101,5,5);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        System.out.println();
        Thread.sleep(2000);

        System.out.println("Buyer 3");                      //Not enough iceCream
        s1.seller(10,101,10);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        System.out.println();
        Thread.sleep(2000);

        System.out.println("Buyer 4");                      //Not enough juice
        s1.seller(10,1,101);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        System.out.println();
        Thread.sleep(2000);

        System.out.println("Buyer 5");                     //Not enough money
        s1.seller(1,1,1);
        System.out.println("We have donuts: " + s1.getDonut() + " IceCream: " + s1.getIceCream() + " Juice: " + s1.getJuice());
        Thread.sleep(3000);
    }
}
