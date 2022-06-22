package _3_ItProger_Java;

public class Nested_Clases {
    int a = 100;
    final float b = 50;
    static float c = 0;

    void getVal(){
        a=10;
        c=b*c;
        System.out.println("c = " + c);
        Neseted_.j = 7;

        Neseted_ nn = new Neseted_();
        nn.i =7;

    }
    static void getValue (){
        Nested_Clases n = new Nested_Clases();
        c=n.b*5;
        c++;
        System.out.println("c = " + c);
        Neseted_.j=30;
    }








    static class Neseted_{
        Nested_Clases n1 = new Nested_Clases();
        //Nested_Clases.n1.c = 20;

        public void chang(){
            Nested_Clases.c = 10;
            n1.a=8;
        }

        int i = 5;
        static int j = 10;
        final int k = 20;

    }




    public static void main(String[] args) {

    }
}
