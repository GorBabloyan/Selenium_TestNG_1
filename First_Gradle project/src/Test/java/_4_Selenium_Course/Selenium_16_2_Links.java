package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_16_2_Links {

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //driver.findElement(By.linkText("Today's Deals")).click();
        //driver.findElement(By.partialLinkText("Deals")).click();

        //Haw to capture all the links in web page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The links in Amazon page are: " + links.size());

//        for (WebElement link:links){
//            System.out.println("link: " + link.getText());
//        }

        for (int i=0; i<links.size(); i++){
          System.out.print(i + "_ " + links.get(i).getText() + "-----");
          System.out.println(links.get(i).getAttribute("href"));

        }
        
    }
}
