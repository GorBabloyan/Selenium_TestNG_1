package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_27_1_Tooltips {
    public static void main(String[]args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        WebElement input = driver.findElement(By.xpath("//*[@id=\"age\"]"));
        String tooltipText = input.getAttribute("title");
        System.out.println(tooltipText);

        Thread.sleep(3000);
        driver.quit();
    }
}
