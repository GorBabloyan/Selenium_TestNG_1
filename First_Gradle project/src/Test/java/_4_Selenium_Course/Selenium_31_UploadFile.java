package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Selenium_31_UploadFile {
    public static void main(String[]args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();

        //Using senKeys method if inputs type is file type = "file"
        //driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]"))
        //        .sendKeys("C:\\Users\\user\\Documents\\French_Short_Stories.pdf");


        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",button);  //click action if click not woking


        //1_copy path
        //2_CTRL + v
        //3_Enter
        Robot rb = new Robot();
        rb.delay(3000);

        StringSelection ss = new StringSelection("C:\\Users\\user\\Documents\\French_Short_Stories.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //ctrl + v
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //Enter
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);




    }
}
