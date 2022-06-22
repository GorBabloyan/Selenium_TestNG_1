package _4_Selenium_Course.Ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gorbabloyan@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("gorgor198");

        Thread.sleep(1000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_7p\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/span/div/div[2]/div/div[2]/div/div/div/span[2]/div/div")).click();





    }
}
