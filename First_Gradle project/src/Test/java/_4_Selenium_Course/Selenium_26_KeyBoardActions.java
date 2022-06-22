package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_26_KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        act.sendKeys(Keys.ALT).perform();
        Thread.sleep(1500);

        act.sendKeys(Keys.CONTROL).perform();
        Thread.sleep(1500);

        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        driver.quit();


    }
}
