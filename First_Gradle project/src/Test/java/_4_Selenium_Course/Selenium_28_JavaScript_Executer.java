package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Selenium_28_JavaScript_Executer {
    public static void main(String[]args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));

//        //Syntax
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript(Script,args)

        //flash
        Selenuim_28_0_0_JavaScriptExecuter_Util.flashByjs(element,driver);
        Thread.sleep(3000);

        //draw border & take screenshot
        Selenuim_28_0_0_JavaScriptExecuter_Util.drawBorder(element,driver);

        TakesScreenshot ts =(TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\user\\First_Gradle project\\src\\test\\java\\Screenshots\\FulPage.png");
        FileUtils.copyFile(src,target);


        //Getting title of the page

        System.out.println(Selenuim_28_0_0_JavaScriptExecuter_Util.getTitleByJS(driver));

        // click action

        Selenuim_28_0_0_JavaScriptExecuter_Util.clickElementByJS(element,driver);

        //Generate alert

//        String massage = "Hello world";
//        Selenuim_28_0_0_JavaScriptExecuter_Util.generateAlert(driver,massage);
//        Thread.sleep(3000);

        //Refresh page
        Selenuim_28_0_0_JavaScriptExecuter_Util.refreshBrowserByJS(driver);
        Thread.sleep(1000);

        //Scrolling page down
        Selenuim_28_0_0_JavaScriptExecuter_Util.scrollPageDown(driver);
        Thread.sleep(3000);

        //Scrolling page up
        Selenuim_28_0_0_JavaScriptExecuter_Util.scrollPageUp(driver);
        Thread.sleep(3000);

        //Zoom page
        Selenuim_28_0_0_JavaScriptExecuter_Util.zoomPageByJS(driver);

        Thread.sleep(3000);
        driver.quit();


    }
}
