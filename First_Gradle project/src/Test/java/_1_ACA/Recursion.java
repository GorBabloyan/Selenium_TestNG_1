package _1_ACA;

public class Recursion {
    static int count = 0;
    static void v1(){
        count++;
        if (count<=5){
            System.out.println("Caunt = " + count);
            v1();
        }

    }
//    static void v(){
//        System.out.println("Hello world");
//        v();
//    }

    public static void main(String[]args){
//        v();
        v1();
    }
}
