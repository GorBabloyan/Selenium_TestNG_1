package _1_ACA.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_findElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        String value_1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[1]/span[1]")).getText();
        String value_2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[1]/span[1]")).getText();

        System.out.println("Value one is" + value_1);
        System.out.println("Value two is" + value_2);
       // driver.quit();

    }
}
