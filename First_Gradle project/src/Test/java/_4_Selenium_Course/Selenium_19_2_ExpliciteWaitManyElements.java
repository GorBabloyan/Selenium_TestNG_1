package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_19_2_ExpliciteWaitManyElements {

    public static WebElement waitForElementPresent(WebDriver driver,By locator, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);
    }



    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));


        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        By eleLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3");

        waitForElementPresent(driver, eleLocator, 5);





        //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div[1]/div/a/h3")).click();

    }

}
