package _3_ItProger_Java;

import java.util.Scanner;

public class java_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Please type your name");
//        String name = scan.nextLine();
//        System.out.println("Hello\t" + name);

            System.out.println("Enter number one");
            float num1 = scan.nextFloat();

            System.out.println("Enter what need to do");
            String act = scan.next();

            System.out.println("Enter number two");
            float num2 = scan.nextFloat();

            switch (act) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case "%":
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
            }

        int i = 5;
        int j = 10;
        int k = 20;
        System.out.println(i+j+k);



    }
}
