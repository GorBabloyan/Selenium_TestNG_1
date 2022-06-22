package _3_ItProger_Java;

class Porc {
    void sum2() {
        ex5 ex001 = new ex5();
        System.out.println(ex001.sum(7));
        System.out.println(ex001.sum(10));
    }
}

public class ex5 {
    int x = 5;

    int sum(int y) {
        int z = x + y;
        return z;
    }


    public static void main(String[] args) {
        Porc p = new Porc();
        p.sum2();

        byte[] arr = {1,2,3};
        ex4 e = new ex4();
        System.out.println(e.sum(arr));



    }
}
