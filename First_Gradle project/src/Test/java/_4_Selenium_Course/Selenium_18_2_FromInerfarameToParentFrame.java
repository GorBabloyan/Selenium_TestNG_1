package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_18_2_FromInerfarameToParentFrame {

    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
       // WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
        driver.switchTo().frame("iframeResult");
        //WebElement innerFrame = driver.findElement(By.linkText("https://www.w3schools.com"));
        driver.switchTo().frame(0);
        driver.findElement(By.id("navbtn_menu")).click();
        Thread.sleep(3000);
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());


        driver.quit();
    }
}

// //*[@id="iframeResult"]
//  //*[@id="iframeResult"]
//   /html/body/iframe[1]
//  /html/body/iframe
//smolll iframe /html/body/iframe
//big iframe    //*[@id="iframeResult"]
//menu button     //*[@id="navbtn_menu"]