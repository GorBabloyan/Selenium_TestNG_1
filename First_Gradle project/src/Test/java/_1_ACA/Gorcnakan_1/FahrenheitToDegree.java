package _1_ACA.Gorcnakan_1;

public class FahrenheitToDegree {
    private double celsius;
    private double fahrenheit;



    double calculateToCelsius(double fahrenheit){
        return this.celsius = (fahrenheit-32) * 5/9;
    }
    double calculateToFahrenheit(double celsius){
        return this.fahrenheit = celsius * 1.8 + 32;
    }

    String yourNum (double num){
        double toCelsius = calculateToCelsius(num);
        double toFahrenheit = calculateToFahrenheit(num);
        return "Your number in Fahrenheit: " + toFahrenheit + " And your number in Celsius: " + toCelsius;
    }
   // F = C * 9/5 + 32.
    // °C = (°F - 32) × 5/9
    //Write a program that can convert degrees Fahrenheit to Celsius, and vice versa.
//
//    void setCelsius(double celsius) {
//        this.celsius = celsius;
//    }
//
//    void setFahrenheit(double fahrenheit) {
//        this.fahrenheit = fahrenheit;
//    }
//
//    double getCelsius(){
//        return this.celsius;
//    }
//    double getFahrenheit(){
//        return  this.fahrenheit;
//    }
}
