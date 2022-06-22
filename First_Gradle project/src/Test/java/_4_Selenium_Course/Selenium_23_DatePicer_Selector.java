package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_23_DatePicer_Selector {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bookonwardticket.com/dummy-ticket/?gclid=CjwKCAjw3cSSBhBGEiwAVII0Z1TIIM0_2oaZgw76XfTm6q2e7qShoCD7SOAKi78_oMVO0u3ymqIe4RoCYD4QAvD_BwE");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"dummy-departure-date\"]")).click();
        Select mon = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
        mon.selectByVisibleText("Nov");
        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
        year.selectByVisibleText("2025");

        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//tr//td"));
        for (WebElement day: days){
            String d = day.getText();
            if (d.equalsIgnoreCase("29")){
                day.click();
                break;

            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
