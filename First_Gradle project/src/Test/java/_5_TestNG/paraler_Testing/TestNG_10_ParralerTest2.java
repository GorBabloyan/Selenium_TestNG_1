package _5_TestNG.paraler_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_10_ParralerTest2 {

    WebDriver driver;
    @Test
    void logInTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Thread.sleep(2000);
        driver.findElement(By.id("input-email")).sendKeys("gorbabloyan@mail.ru");
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        Assert.assertEquals("My Account",driver.getTitle());
        Thread.sleep(3000);
    }

    @AfterMethod
    void finish(){
        driver.quit();
    }

}
