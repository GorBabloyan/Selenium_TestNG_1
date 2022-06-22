package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Selenium_11_DropDown_sorting {

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[1]/div/div[1]/div/div/div/div[1]/div[2]")).click();
        List<WebElement> categories = driver.findElements(By.xpath("//*[@id=\"services\"]/div/div[1]/div/div[1]/div/div/div/div[2]/ul//li"));
        ArrayList original = new ArrayList();
        ArrayList temp = new ArrayList();


        for(WebElement categorie:categories){
            original.add(categorie.getText());
            temp.add(categorie.getText());
        }
        Collections.sort(temp);
        System.out.println(original);
        System.out.println(temp);

        if(categories.equals(temp)){
            System.out.println("Dropdown menu Sorted...");
        }
        else{
            System.out.println("Dropdown menu Unsorted...");
        }
        driver.close();
    }
}
