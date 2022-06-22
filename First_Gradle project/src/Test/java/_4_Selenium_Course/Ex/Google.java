package _4_Selenium_Course.Ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Google {
    WebDriver driver = new ChromeDriver();
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
    }
    @Test
    void test1() throws InterruptedException
        {
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
                    .sendKeys("Hello");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"))
                    .click();
            Thread.sleep(1000);
            String text = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input"))
                    .getAttribute("value");
            System.out.println(text);
            assertEquals("Hello", text );
//            @FindBy(id="name");

        }
        @AfterClass
        void finish(){
            driver.quit();
        }

}

