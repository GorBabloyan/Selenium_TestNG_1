package _4_Selenium_Course.NewFeauters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class New_feauters_2_Relative_Locators {
    WebDriver driver;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();
    }
  //  @Test(description = "test book five: its below book one and in the left of book 6")
    void  testBookFive(){
        WebElement book5 = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
        String tagName = book5.getAttribute("tagName");
        System.out.println(tagName);
        Assert.assertEquals(tagName,"li");
    }
    @Test(description = "Test book two: its above book 6 and right of book 1")
    void testBookTwo(){
        WebElement book2=driver.findElement(RelativeLocator.with(By.tagName("li")).above(By.id("pid6")).toRightOf(By.id("pid1")));
        String id = book2.getAttribute("id");
        System.out.println(id);
        Assert.assertEquals(id , "pid2");
    }


    @AfterClass
    void Finish () throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
