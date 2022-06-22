package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_24_1_Mouse_doubleClick {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");
        WebElement feald_1 = driver.findElement(By.id("field1"));
        feald_1.clear();
        feald_1.sendKeys("Welcome Gor");
        WebElement button = driver.findElement(By.xpath("/html/body/button"));

        Actions act = new Actions(driver);
        act.doubleClick(button).perform(); //double click
        //act.doubleClick(button).build().perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
