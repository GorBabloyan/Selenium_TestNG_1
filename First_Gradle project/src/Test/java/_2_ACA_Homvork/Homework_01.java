package _2_ACA_Homvork;

public class Homework_01 {

   static void V1 (int a, int b, int c, String order ){
       if(order=="descending"){
       if (a>b && a>c){
           if (b>c){
               System.out.println(a +" "+ b+" " + c);
           }
           else{
               System.out.println(a +" "+ c +" "+ b);
           }
       }
       if (b>a && b>c){
           if (a>c){
               System.out.println(b +" "+ a +" "+ c);
           }
           else{
               System.out.println(b +" "+ c +" "+ a);
           }
       }
       if (c>a && c>b){
           if (a>b){
               System.out.println(c +" "+  a +" "+  b);
           }
           else{
               System.out.println(c +" "+  b +" "+  a);
           }
       }
       }

       if(order=="ascending"){
           if (a>b && a>c){
               if (b>c){
                   System.out.println(c +" "+ b+" " + a);
               }
               else{
                   System.out.println(b +" "+ c +" "+ a);
               }
           }
           if (b>a && b>c){
               if (a>c){
                   System.out.println(c +" "+ a +" "+ b);
               }
               else{
                   System.out.println(a +" "+ c +" "+ b);
               }
           }
           if (c>a && c>b){
               if (a>b){
                   System.out.println(b +" "+  a +" "+  c);
               }
               else{
                   System.out.println(a +" "+  b +" "+  c);
               }
           }
       }

    }

     public static void main(String[] args){
         V1(1,2,3, "descending");

}
}
