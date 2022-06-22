package _3_ItProger_Java;

class ex2{
     static int a = 10;
}

public class ex1 {

    static int m1(int a){
       return 4+a;
    }

    public static void main(String[] args) {
//        String txt = "Hel\b\blo World!";
//        System.out.println(txt);
//
//        System.out.println();
//
//        String txt2 = "Helloffffff\rHelloWorld!";
//        System.out.println(txt2);
//
//        int[] i = {1, 5, 2, 7, 6,};
//        int[] j = {1, 5, 2, 7, 6,};
//        Math.min(7,5);
//        int ran = (int)(Math.random() * 101);
//        System.out.println(ran);

        int[][] myNum = {{1,2,3,4,5},{6,7,8,9}};
        int j = myNum.length;
        int k = myNum[j-1].length;
        System.out.println("j = " + j);
        System.out.println("k = " + k);



        for (int l=0;l<myNum.length;++l){
            for (int i=0; i<myNum[l].length;++i){
                System.out.println(myNum[l][i]);
            }
        }
        ex2 ex = new ex2();
        ex.a++;

       int f =  m1(5) +3;



    }
}
