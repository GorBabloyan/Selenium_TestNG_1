package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_25_Slider {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#range");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

        WebElement min = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
        System.out.println(min.getLocation());  //(84, 47)
        System.out.println(min.getSize());  //(22, 21)
        WebElement max = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        System.out.println(max.getLocation()); //(340, 47)

        Actions act = new Actions(driver);
        act.dragAndDropBy(min, 120,0).perform();
        act.dragAndDropBy(max,50,0).perform();

        System.out.println(min.getLocation() + "   " + max.getLocation());




        Thread.sleep(3000);
        driver.quit();


    }
}
