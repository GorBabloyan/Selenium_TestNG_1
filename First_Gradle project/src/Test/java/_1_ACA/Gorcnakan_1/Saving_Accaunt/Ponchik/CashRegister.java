package _1_ACA.Gorcnakan_1.Saving_Accaunt.Ponchik;

import java.util.Scanner;

public class CashRegister {
    static double priceForDonut = 100;
    static double priceForIceCream = 200;
    static double priceForJuice = 250;
    public double price;
    public boolean cashRegisterApproved;

    Scanner s = new Scanner(System.in);

    boolean payFor(int donut, int iceCream, int juice) {
        price = donut * priceForDonut + iceCream * priceForIceCream + juice * priceForJuice;
        System.out.println("CashRegister: You need to pay: " + price);
        System.out.print("CashRegister: Please input money: ");
        double input = s.nextDouble();
        if (input == price){
            System.out.println("CashRegister: This is your check: THANK YOU");
            cashRegisterApproved = true;
        } else if (input>price) {
            double tempMoney = input - price;
            System.out.println("CashRegister: This is your check and your cash: " + tempMoney +" THANK YOU");
            cashRegisterApproved = true;
        }
        else {
            System.out.println("CashRegister: Sorry but you have not enough money for pay");
            cashRegisterApproved = false;
        }
        return cashRegisterApproved;
    }
}
