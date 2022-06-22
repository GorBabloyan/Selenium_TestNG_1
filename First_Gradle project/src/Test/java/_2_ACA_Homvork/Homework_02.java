package _2_ACA_Homvork;

public class Homework_02
{
    static int avgOf(int a){
        int num = a, awg = 1;
        if (a<=0){
            return 0;
        }
        else{
            for (int i=0; i<a; i++){
                awg= awg*num;
                num=num-1;
            }
                return awg;
            }
    }
    public static void main(String[]args){
        System.out.println("The avg is " + avgOf(3));
    }
}
