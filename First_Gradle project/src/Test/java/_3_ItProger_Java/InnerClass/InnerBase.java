package _3_ItProger_Java.InnerClass;

public class InnerBase {
    public static void main(String[] args) {

        InnerChild1 child1 = new InnerChild1();
        child1.engine.setReady(true,100);
        System.out.println(child1.engine.info());

        InnerChild2 child2 = new InnerChild2();
        child2.engine.setReady(false,100000);
        System.out.println(child2.engine.info());

        child1.setValues("BMW","blue");
        System.out.println(child1.getValue());

        child1.ch1();
        child2.ch2();

    }
}
