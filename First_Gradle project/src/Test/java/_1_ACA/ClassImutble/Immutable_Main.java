package _1_ACA.ClassImutble;

public class Immutable_Main {
    public static void main(String[] args) {
        Immutable i = new Immutable("Stive",1500.0,45);
        System.out.println("Name is " + i.getName() + ". Salary is "+ i.getSalary() + " and age is "+ i.getAge() + "\n" +"You can change anything ");

    }

}
