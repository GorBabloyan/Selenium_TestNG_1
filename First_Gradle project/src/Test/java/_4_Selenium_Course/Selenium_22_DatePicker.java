package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_22_DatePicker {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");

        String year = "2022";
        String month = "Nov";
        String date = "29";
        driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
        while (true) {
            String monthyear = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
            String arr[] = monthyear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (month.equalsIgnoreCase(mon) && year.equalsIgnoreCase(yer))
                break;
            else
                driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
        }

        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table//tr//td"));

        for (WebElement day : days) {
            String d = day.getText();
            if (d.equalsIgnoreCase(date)) {
                day.click();
                break;
            }
        }

        Thread.sleep(5000);
        driver.quit();


    }
}
