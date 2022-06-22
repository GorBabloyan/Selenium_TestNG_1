package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_24_2_DragAndDrop {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));

        WebElement picture = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
        WebElement pic1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
        WebElement trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));

        Actions act = new Actions(driver);
        act.dragAndDrop(picture,trash).perform();
        act.dragAndDrop(pic1,trash).perform();
        //act.dragAndDropBy(picture,sq1,sq2).perform();


        Thread.sleep(3000);
        driver.quit();

    }
}
