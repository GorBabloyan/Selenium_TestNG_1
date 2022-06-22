package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Selenium_30_DownloadFile {
    public static void main(String[] args) throws InterruptedException {

        String location = System.getProperty("user.dir") + "\\Downloads\\";

        // Chrome
        HashMap preferences = new HashMap();
        preferences.put("download.default_directory",location);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[4]/td[5]/a")).click();
        Thread.sleep(3000);
        //driver.quit();

    }
}
