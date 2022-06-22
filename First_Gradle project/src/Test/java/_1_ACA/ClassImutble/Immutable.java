package _1_ACA.ClassImutble;

public final class Immutable {
    private final String name;
    private final double salary;
    private final int age;

    public Immutable(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    double getSalary(){
        return this.salary;
    }
    int getAge(){
        return this.age;
    }
}
