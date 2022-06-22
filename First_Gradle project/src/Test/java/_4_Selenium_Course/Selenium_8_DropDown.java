package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_8_DropDown {

    public static  void  main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=product/search");

        WebElement allCategories = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/select"));
        Select Categories = new Select(allCategories);

        WebElement select = driver.findElement(By.name("country_id"));
        Categories.selectByVisibleText("Food");
        Categories.selectByValue("27");
        Categories.selectByVisibleText("Desktops");
        System.out.println("is selected: "+ allCategories.isSelected());
        Categories.selectByIndex(3);
        List <WebElement>  allOptions = Categories.getOptions();
        for (WebElement option :allOptions){
            if (option.getText().equals("Components")){
                option.click();
                break;
            }
                  }
    }
}

