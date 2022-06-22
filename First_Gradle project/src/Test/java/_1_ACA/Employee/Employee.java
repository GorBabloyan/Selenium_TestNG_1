package _1_ACA.Employee;
public class Employee {
    private double salary;
    private int hours;
    void getInfo(double salary, int hours){
        this.salary = salary;
        this.hours = hours;
        addSal();
        addWork();
        System.out.println("Your salary after additions will be: " + this.salary);
    }
    void addSal(){
        if (this.salary<500){
            this.salary +=10;
        }
    }
    void addWork(){
        if (hours>6){
            this.salary+=5;
        }
    }
}
