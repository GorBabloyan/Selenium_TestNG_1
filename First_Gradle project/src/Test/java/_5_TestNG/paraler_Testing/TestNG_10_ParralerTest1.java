package _5_TestNG.paraler_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_10_ParralerTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(3000);

    }

    @Test
    void tittleTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.get("https://demo.opencart.com/");
        String tittle = driver.getTitle();
        Assert.assertEquals("Your Store",tittle);
        Thread.sleep(3000);
    }

    @AfterMethod
    void finish(){
        driver.quit();
    }
}
