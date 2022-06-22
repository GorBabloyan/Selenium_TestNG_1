package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_17_1_Autorization_Alert {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");

        driver.get("https://the-internet.herokuapp.com/basic_auth");
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");




    }
}
