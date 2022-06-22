package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_14_CheckBoxes {

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        //driver.findElement(By.id("monday")).click();
        List<WebElement> allChackboxes = driver.findElements(By.className("form-check-input"));
        for (WebElement oneBox : allChackboxes){
//            String name = oneBox.getAttribute("id");
//            if (name.equals("monday") || name.equals("sunday")) {
//                oneBox.click();
//            }
            //System.out.println(oneBox.getAttribute("id"));
            if (oneBox.getAttribute("id").contains("day")) {
                oneBox.click();
            }
        }
        int a = allChackboxes.size();
        for(int i=a-5; i<a; i++){
            allChackboxes.get(i).click();
        }


    }
}
