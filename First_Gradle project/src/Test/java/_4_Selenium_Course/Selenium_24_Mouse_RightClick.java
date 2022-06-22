package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_24_Mouse_RightClick {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

        Actions act = new Actions(driver);
        act.contextClick(button).perform(); //Right click
        //act.contextClick(button).build().perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
