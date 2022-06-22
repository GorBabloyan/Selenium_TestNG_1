package _2_ACA_Homvork;

public class Homework_1 {
     static void v1(int a, int b, int c, String order){
        int i=0, temp=0;
        while (i<2 && order=="ascending") {
            if (a > b) {    //231  //123
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }  i++;
        }
        while (i<2 && order=="descending") {
            if (a < b) {    //321
                temp = a;
                a = b;
                b = temp;
            }
            if (b < c) {
                temp = b;
                b = c;
                c = temp;
            }  i++;
        }

        System.out.println(a + " " + b + " " + c);
    }

    static public void main(String[] args){

        v1(1,2,3,"descending");
    }
}
