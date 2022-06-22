package _3_ItProger_Java.Abstraction;

public class parent extends AbstractClass{

        public String name;
        @Override
        public String name() {
            return this.name;
        }

        @Override
        public void eat() {
            System.out.println("This is eat");

        }

        @Override
        public void run() {
            System.out.println("This is run");
        }

    @Override
    public void display() {
        super.display();
    }
}

