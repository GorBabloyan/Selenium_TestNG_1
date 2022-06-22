package _5_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_8_Parameters {

    public WebDriver driver;
    @Parameters({"browser","URL"})       //This will come from testng.xml file
    @BeforeTest
    void setup(String browser, String URL){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get(URL);
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
        //Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
    }

    @Test
    void title(){
        String title = driver.getTitle();
        Assert.assertEquals("Your Store is",title, "Title is not Matched");
        // Assert.assertTrue(title.equals("Your Store"), "Title not right");

    }


    @AfterClass
    void  finish(){
        driver.quit();
    }

}
