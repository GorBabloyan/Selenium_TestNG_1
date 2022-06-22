package _3_ItProger_Java._Polimorfism;

public class Polimorfism_Base {

    static public void stat() {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        Polimorfism_Base pb = new Polimorfism_Base();
        stat();
        pb.s();


        polimorfism_1 p1 = new polimorfism_1();
        polimorfism_1 p2 = new polimorfism_2();
        // p1.animal();
        p2.animal();
        p2.animal("dog");
        p2.animal("cat", 5);

        p1.eat();
        p2.eat();
    }

     void s() {
        stat();
    }


    static class B {
          void stat() {
            System.out.println("Static");
        }

    }
}
