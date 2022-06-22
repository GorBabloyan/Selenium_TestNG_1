package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_13_DropDown_Autoompleate_google_Places {

    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.wait(1000);
        driver.get("https://www.twoplugs.com/newsearchserviceneed");
        //driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
        searchBox.clear();
        searchBox.sendKeys("Armenia");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String text;
        do {

            searchBox.sendKeys(Keys.ARROW_DOWN);
            text = searchBox.getAttribute("value");
            System.out.println("The text value: " + text);
            if (text.contains("Armenia, El Salvador")){
                searchBox.sendKeys(Keys.ARROW_RIGHT);
                break;
            }
        }
            while (!text.isEmpty());
    System.out.println("Finish");



    }
}
