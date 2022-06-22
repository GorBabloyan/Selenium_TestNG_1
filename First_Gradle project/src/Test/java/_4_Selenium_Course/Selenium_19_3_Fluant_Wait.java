package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class Selenium_19_3_Fluant_Wait {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\\\"rso\\\"]/div[7]/div/div[1]/div/a/h3"));

            }
        });
        element.click();

       // By eleLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3");


        //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div[1]/div/a/h3")).click();

    }
}
