package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_18_1_innerIframe {

    static public void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
        WebElement outerIframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
        driver.switchTo().frame(outerIframe);

        WebElement inerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(inerframe);

        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hello");
        Thread.sleep(3000);
        driver.quit();

    }
}


