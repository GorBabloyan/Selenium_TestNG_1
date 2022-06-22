package _3_ItProger_Java.InharutencePolimorfism._Inherit;

public class Child {
    Parent p = new Parent() {
        @Override
        public void print2() {
            System.out.println("print 2 implement");
        }

        @Override
        public void sub() {
            System.out.println("child implement");
        }

        @Override
        void chang() {
            i++;
            j++;
        }
    };


}
