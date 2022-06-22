package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Selenium_7 {

    public static void main(String[] args){

        //System.out.println("Hello");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElements(By.name("email"));


        WebElement Login = driver.findElement(By.name("email"));
        //email.sendKeys("111112");
        Login.clear();
        Login.sendKeys("gorbabloyan@mail.ru");
        System.out.println(Login.getAttribute("id")); //its will return attribute of value
        System.out.println(Login.getText());                // Will return "hello babe" <input id=""005, name = "email"> Hello babe  <input/>
        System.out.println("Buttton text is: "+ driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[1]/label")).getText());


    }
}
