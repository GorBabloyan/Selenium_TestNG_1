package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium_10_Dropdown_jquerry {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        driver.findElement(By.id("justAnInputBox")).click();
        String all = "all";
        v1(driver, "all" );

    }
    public static void v1(WebDriver driver, String... value){
        List<WebElement> choiceList = driver.findElements(By.className("comboTreeItemTitle"));
//List<WebElement> choiceList = driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/ul//li"));
//
//        for (WebElement item : choiceList){
//            System.out.println("The text is: " + item.getText());
//        }
        if (!value[0].equals("all"))
        //if (!value[0].equalsIgnoreCase("all"))
        {
            for (WebElement element:choiceList)
            {
                String text = element.getText();
                for (String val:value)
                {
                    if (text.equals(val)){
                        element.click();
                        break;
                    }

                }
            }
        }
        else {
            try {
                for (WebElement element : choiceList) {
                    element.click();
                }
            }
            catch (Exception e1){

            }

        }

    }
}
