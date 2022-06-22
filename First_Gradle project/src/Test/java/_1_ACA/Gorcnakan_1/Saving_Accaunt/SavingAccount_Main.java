package _1_ACA.Gorcnakan_1.Saving_Accaunt;

public class SavingAccount_Main {
    public static void main(String[] args) {
        SavingAccount.annualInterestRate = 4.0;
        SavingAccount saver1 = new SavingAccount(2000.0);
        SavingAccount saver2 = new SavingAccount(3000.0);
        System.out.println("Saver 1 :" + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 :" + saver2.calculateMonthlyInterest());
        SavingAccount.modifyInterestRate(5.0);
        System.out.println("Saver 1 :" + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 :" + saver2.calculateMonthlyInterest());


    }
}
