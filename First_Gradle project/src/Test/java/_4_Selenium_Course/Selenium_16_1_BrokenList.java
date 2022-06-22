package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Selenium_16_1_BrokenList {

    public static  void main(String[]args) throws IOException {
        int brokenLink = 0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement element : links){
            String url = element.getAttribute("href");
            if (url==null || url.isEmpty()){
                System.out.println(element + "This url is empty");
                continue;
            }
            URL link = new URL(url);
            try{
            HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
            httpcon.connect();
            if(httpcon.getResponseCode()>400){
                System.out.println(httpcon.getResponseCode() + url + " -its broken link");
                brokenLink++;
            }
            else{
                System.out.println(httpcon.getResponseCode() + url + " -its valid link");
            }
            }
            catch (Exception e){

                System.out.println("I cathch you" );
            }
        }
            System.out.println("Broken link are:" + brokenLink);
            driver.quit();
    }
}
