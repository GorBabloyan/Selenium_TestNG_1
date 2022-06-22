package _1_ACA.aca.pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("large",5,5,20);
        System.out.println(pizza.getDescription());
        System.out.println("Pizzas cost is: " + pizza.calcCost() + " $");
    }
}
