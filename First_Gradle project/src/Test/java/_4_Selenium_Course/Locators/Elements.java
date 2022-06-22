package _4_Selenium_Course.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements {

    final  String password = "password";
    WebDriver driver;

     Elements(String browser, String url) {
        if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
            this.driver.get(url);
        }
        else if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            this.driver = new EdgeDriver();
            this.driver.get(url);
        }
        else {
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
            this.driver.get(url);
        }
    }
}


