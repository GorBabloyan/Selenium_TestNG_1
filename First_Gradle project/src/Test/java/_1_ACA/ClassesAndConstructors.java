package _1_ACA;

class a {
    int i;
    int j;

    a(int i, int j) {
//        this.i = i;
//        this.j = j;
//        i = 1;
//        j = 2;
        System.out.println("This is i + j " + i + "  " + j);
        System.out.println("This is This.i + This.j" + this.i + "  " + this.j);
    }

    a() {
        System.out.println("This is i + j " + i + "  " + j);
        System.out.println("This is This.i + This.j" + this.i + "  " + this.j);
    }

    int b() {
        return i + j;
    }
}

public class ClassesAndConstructors {
    public static void main(String[] args) {
        a obja = new a();
        a obja2 = new a(1, 2);
        obja2.j = 10;
        obja2.i = 20;
        System.out.println(obja.b());


    }
}
