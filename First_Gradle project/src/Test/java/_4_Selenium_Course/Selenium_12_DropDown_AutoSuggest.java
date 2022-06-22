package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Selenium_12_DropDown_AutoSuggest {

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.bing.com/");
        driver1.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
        driver1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("java");

        List<WebElement> optons1 = driver1.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul//li"));
        //List<WebElement> options = driver.findElements(By.className("sa_sg"));
        //System.out.println("The size of options is: " + options.size());
        System.out.println("The size of google elements is " + optons1.size()) ;

        for (WebElement option:optons1){
            System.out.println(option.getText());
            if (option.getText().contains("compiler")){
                option.click();
                break;
            }
        }

//        for(WebElement option:options){
//            System.out.println(option.getText());
//            if (option.getText().equals("selenium sulfide")){
//                option.click();
//                break;
//            }
//        }

    }
}
