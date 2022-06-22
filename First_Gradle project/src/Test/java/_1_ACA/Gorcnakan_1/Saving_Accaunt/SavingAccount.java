package _1_ACA.Gorcnakan_1.Saving_Accaunt;

// Use a static variable annualInterestRate to store the annual interest rate for all account holders.
//Each object of the class contains a private instance variable savingsBalance indicating
// the amount the saver currently has on deposit.

//Provide method calculateMonthlyInterest to calculate the monthly  interest by multiplying the
// savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance
//Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
//Write a program to test class SavingsAccount.
// Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
// Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers.

public class SavingAccount {
    static double annualInterestRate;   //for all account holders
    private double savingsBalance;

    SavingAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    double calculateMonthlyInterest (){
       // for (int i=0; i<12; i++ ) {
            this.savingsBalance = this.savingsBalance / 100 * annualInterestRate / 12 + this.savingsBalance;
       // }
        return this.savingsBalance;
    }

    static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate= newAnnualInterestRate;
    }



}
