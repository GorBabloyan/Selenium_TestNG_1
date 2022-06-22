package _2_ACA_Homvork;

public class Homework_002 {
    static void primeNum(int a){
        int num = a;
        int k=0;
        for (int j=1; j<a; j++) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    k++;
                }
            }
            if (k > 2) {
                //System.out.println("Its a not a prime " + num);
            } else {
                System.out.println( num + " is a prime number" );
            }
            k = 0;
            num--;
        }
    }
    public static void main(String[] args){
        primeNum(100);
    }
}

