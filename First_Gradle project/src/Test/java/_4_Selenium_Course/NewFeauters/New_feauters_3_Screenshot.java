package _4_Selenium_Course.NewFeauters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class New_feauters_3_Screenshot {
    WebDriver driver;
    @Test
    void TestScreenshot() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\user\\Desktop\\2.png");
        FileUtils.copyFile(src,trg);
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    void TakePartScreenShot () throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();

        WebElement book_3 = driver.findElement(By.xpath("//*[@id=\"pid3\"]"));
        File src=book_3.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\user\\Desktop\\3.png");
        FileUtils.copyFile(src,trg);
        Thread.sleep(3000);


        driver.quit();
    }

    @Test
    void TakeLogoScreenShot () throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        WebElement book_3 = driver.findElement(By.xpath("//*[@id=\"selenium_logo\"]"));
        highlightElement(book_3,driver);
        File src=book_3.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\user\\Desktop\\3.png");
        FileUtils.copyFile(src,trg);
        Thread.sleep(3000);


        driver.quit();
    }

    void highlightElement(WebElement ele, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='6px solid red'",ele);
    }
}
