package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_17_Alerts {

    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // When Alert have only on ok button

//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();

        //Alert window with ok and cancel buttons

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Thread.sleep(5000);
        String text = driver.switchTo().alert().getText();
        int text1 = driver.switchTo().alert().hashCode();
        System.out.println(text + text1);
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();

        //Alert window with input box,  ok and cancel buttons
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
//        Thread.sleep(2000);
//
//        Alert alertWindow = driver.switchTo().alert();
//        System.out.println(alertWindow.getText());
//        alertWindow.sendKeys("Welcome");
//        Thread.sleep(5000);
//        alertWindow.accept();
//        //driver.quit();

    }
}
