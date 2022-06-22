package _4_Selenium_Course.NewFeauters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class New_feauters_1 {
    @Test
    void screenshot() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_iterator.asp");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/a[1]/i"));

        File file  = logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\user\\Desktop\\logo.png"));
        driver.quit();
    }
    @Test
    void newTab() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_iterator.asp");
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    void newWindow() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_iterator.asp");
        driver.switchTo().newWindow(WindowType.WINDOW);
        //driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    void testHeight() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_iterator.asp");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/a[1]/i"));

        System.out.println("Height: " + logo.getRect().getDimension().getHeight());
        System.out.println("Width: " + logo.getRect().getDimension().getWidth());
        System.out.println("X Location: : " + logo.getRect().getX());
        System.out.println("Y Location: :: " + logo.getRect().getY());

        Thread.sleep(3000);
        driver.quit();
    }
}
