package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_27_3_Size_Location_OfElements {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));

        //Location 1-method
        System.out.println("logos x and y cordinationa are " + logo.getLocation());
        System.out.println("logos x coordinate is " + logo.getLocation().getX());
        System.out.println("logos y coordinate is " + logo.getLocation().getY());

        //Location 2-method
        System.out.println("logos x coordinate is " + logo.getRect().getX());
        System.out.println("logos y coordinate is " + logo.getRect().getY());

        //size 1-method
        System.out.println("Size (Width + Height)" + logo.getSize());
        System.out.println("Size (Width )" + logo.getSize().getWidth());
        System.out.println("Size (Height)" + logo.getSize().getHeight());

        //size 2-method
        System.out.println("logos Height + Width is " + logo.getRect().getDimension());
        System.out.println("logos Height is " + logo.getRect().getDimension().getHeight());
        System.out.println("logos Width is " + logo.getRect().getDimension().getWidth());


        driver.quit();


    }
}
