package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Selenium_27_0_CaptureScreenshots {
    public static void main(String[]args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Full page screenshots
        TakesScreenshot ts =(TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\user\\First_Gradle project\\src\\test\\java\\Screenshots\\FullPage.png");
        FileUtils.copyFile(src,target);

        //Take part of Web page screenshot
//        WebElement part = driver.findElement(By.xpath("/html/body/footer"));
//        File src = part.getScreenshotAs(OutputType.FILE);
//        File target = new File("C:\\Users\\user\\First_Gradle project\\src\\test\\java\\Screenshots\\PartPage.png");
//        FileUtils.copyFile(src,target);

//        WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
//        File src = logo.getScreenshotAs(OutputType.FILE);
//        File target = new File("C:\\Users\\user\\First_Gradle project\\src\\test\\java\\Screenshots\\logo.png");
//        FileUtils.copyFile(src,target);

        Thread.sleep(2000);
        driver.quit();



    }
}
