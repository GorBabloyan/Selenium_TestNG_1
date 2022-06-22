package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_9_DropDown {

    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver_2 = new ChromeDriver();
        driver_2.get("https://www.opencart.com/index.php?route=account/register");

        WebElement allCategories = driver_2.findElement(By.xpath("//*[@id=\"input-country\"]"));
        Select categories = new Select(allCategories);
        List<WebElement> options = categories.getOptions();
        System.out.println("The size is " + options.size());
        for (WebElement eleme : options){

            System.out.println(eleme.getText());
            if (eleme.getText().equals("Armenia")){
                System.out.println(eleme.getText());
                break;
            }

        }

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=common/home");

        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul//li"));
        System.out.println("This is lists size:" + elements.size());
        //Select categories = new Select(elements.contains());
//        WebElement elem = elements.get(0);
//        WebElement elem1 = elements.get(1);
//        System.out.println("" + elem.getText() + " " + elem1.getText() );


//        String value = "Register";



        logic( elements, "Login");

    }
    static public void logic(List<WebElement> elements,String value){
                for (WebElement ele:elements)
                {
                     System.out.println("Name is - " + ele.getText());

                      if (ele.getText().equals(value)){
                         ele.click();
                         break;
                                }
                    }

    }
}
