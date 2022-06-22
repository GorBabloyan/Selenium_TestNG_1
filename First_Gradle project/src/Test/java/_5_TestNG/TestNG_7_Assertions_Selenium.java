package _5_TestNG;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_7_Assertions_Selenium {


    WebDriver driver = new ChromeDriver();
    @BeforeTest
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://demo.opencart.com/");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
        //Assert.assertFalse(logo.isDisplayed(),"logo not displayed");
    }

    @Test
    void title(){
        String title = driver.getTitle();
        Assert.assertEquals("Just a moment...",title, "Title is not Matched");
       // Assert.assertTrue(title.equals("Your Store"), "Title not right");

    }


    @AfterClass
    void  finish(){
        driver.quit();
    }



}
