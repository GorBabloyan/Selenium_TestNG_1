package _2_ACA_Homvork;

public class Homework_2 {
    static void sumOf(int a){
        int num = a, sum=0;
        if (a <= 0){
            System.out.println("Incorrect Input. Please input a positive value");
        }
        else {
            for (int i = 0; i < a; i++) {
                sum = num + sum;
                num = num - 1;
            }
            System.out.println("The sum is: " + sum);
        }
    }

    public static void main(String[]args){
        sumOf(5);
    }
}
