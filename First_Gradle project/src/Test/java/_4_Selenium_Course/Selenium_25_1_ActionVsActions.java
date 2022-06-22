package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Selenium_25_1_ActionVsActions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.list.am/en/");
        driver.manage().window().maximize();

        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div/div[1]/span"));


        Actions act = new Actions(driver);
        act.moveToElement(menu).perform();
        WebElement menu_2 = driver.findElement(By.xpath("//*[@id=\"menu\"]/div/div[1]/div/div/span[1]/a"));
        Action action = act.moveToElement(menu_2).build();
        action.perform();


        WebElement menu_3 = driver.findElement(By.xpath("//*[@id=\"menu\"]/div/div[1]/div/div/span[1]/div/div/div[1]/a[1]"));
        menu_3.click();


    }
}
