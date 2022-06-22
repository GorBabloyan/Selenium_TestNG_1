package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_26_1_KeybordActionsMultipleKeys {
    public static void main(String[]args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement box_1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
        WebElement box_2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
        box_1.sendKeys("Welcome to selenium");

        Actions act = new Actions(driver);

        //Ctr A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //Ctr C
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //Tab
        act.sendKeys(Keys.TAB).perform();

        //Ctr V
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        String text_1 = box_1.getAttribute("value");
        String text_2 = box_2.getAttribute("value");
        if (text_1.equals(text_2)){
            System.out.println(text_1 + "  =   " + text_2 + " Text is coped");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
