package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_18_frame_iframe {

    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");

//        driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click(); //We cant reach iframe element this way

//        driver.switchTo().frame("FRAME name or ID");
//        driver.switchTo().frame(0); //Index
//        driver.switchTo().frame()  //Webelement
        driver.switchTo().frame("packageListFrame");//name
        driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
        driver.switchTo().defaultContent();   //go back to the main page

        Thread.sleep(3000);

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[5]/a")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();   //go back to the main page

        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
        driver.quit();
    }
}
