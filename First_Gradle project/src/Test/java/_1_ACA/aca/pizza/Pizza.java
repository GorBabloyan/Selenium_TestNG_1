package _1_ACA.aca.pizza;

//          Create a class named Pizza that stores information about a single pizza. It should contain
//        the following:
//        Private  instance  variables  to  store  the  size  of  the  pizza  (either  small,  medium,
//        or large),
//        the  number of  cheese toppings, the number of pepperoni toppings, and
//        the number of ham toppings.
//        Constructor(s) that set all of the instance variables.

//        Public methods to get and set the instance variables.
//        A public method named )calcCost(  that returns a double that is the cost of the pizza.
//        Pizza cost is determined by:

//        Small: $10 + $2 per topping
//        Medium: $12 + $2 per topping
//        Large: $14 + $2 per topping
//public method named getDescription( ) that returns a String containing the pizza
//        size, quantity of each topping.

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    private double cost;

    Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    void setSize(String size){
        this.size = size;
    }
    void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings = cheeseToppings;
    }
    void setPepperoniToppings(int pepperoniToppings){
        this.pepperoniToppings = pepperoniToppings;
    }
    void setHamToppings(int hamToppings){
        this.hamToppings = hamToppings;
    }
    String getSize() {
        return this.size;
    }
    double getCheeseToppings() {
        return this.cheeseToppings;
    }
    double getPepperoniToppings() {
        return this.pepperoniToppings;
    }
    double getHamToppings() {
        return this.hamToppings;
    }
    public double calcCost() {
        if (this.size.equalsIgnoreCase("small")) {
            this.cost = (this.cheeseToppings + this.pepperoniToppings + this.hamToppings) * 2 + 10;
            return this.cost;
        } else if (this.size.equalsIgnoreCase("medium")) {
            this.cost = (this.cheeseToppings + this.pepperoniToppings + this.hamToppings) * 2 + 12;
            return this.cost;
        } else if (this.size.equalsIgnoreCase("large")) {
            this.cost = (this.cheeseToppings + this.pepperoniToppings + this.hamToppings) * 2 + 14;
            return this.cost;
        } else
            return 0;
    }
    public String getDescription() {
        if (getSize().equalsIgnoreCase("small") || getSize().equalsIgnoreCase("medium") || getSize().equalsIgnoreCase("large")) {
            return "Your pizzas size is " + getSize() + ". In it there are cheese topping " + getCheeseToppings() + " pepperoni toppings " + getPepperoniToppings() + " pepperoni toppings " + getHamToppings();
        } else {
            return "You choose wrong size try again";
        }
    }
}
