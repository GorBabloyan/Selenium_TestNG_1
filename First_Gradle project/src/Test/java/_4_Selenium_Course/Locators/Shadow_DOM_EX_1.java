package _4_Selenium_Course.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Shadow_DOM_EX_1 {
    public static void main(String[] args) throws ClassCastException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://books-pwakit.appspot.com/");
 //       driver.manage().window().maximize();
//        Thread.sleep(300);

        //driver.findElement(By.id("parentId")).getShadowRoot().findElement(By.cssSelector( "label" )).findElement(By.tagName("input"))

        //       s normal with a #shadow-root, the navigation choices for the next hop are limited.
        //     E.g. against Chrome By.cssSelector() and By.className() are valid,
        //     but By.id() and By.tagName() fail with
        //     org.openqa.selenium.InvalidArgumentException: invalid argument: invalid locator

        WebElement root = driver.findElement(By.xpath("//book-app[contains(text(),'BOOKS')]"))
                .getShadowRoot()
                .findElement(By.className("toolbar-top"))
                .findElement(By.className("menu-btn"));
        root.click();

//        WebElement root = driver.findElement(By.xpath("//book-app[contains(text(),'BOOKS')]")).getShadowRoot()
//                .findElement(By.cssSelector("app-header[effects='waterfall']"))
//                .findElement(By.cssSelector(".toolbar-bottom"))
//                .findElement(By.cssSelector("book-input-decorator"))
//                .findElement(By.cssSelector("#input"));
//        root.sendKeys("Books");
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement button = driver.findElement(By.xpath("/html/body/book-app"))
                .getShadowRoot().findElement(By.cssSelector("app-drawer[position='left']"))
                .findElement(By.cssSelector(".drawer-list"))
                .findElement(By.cssSelector("a[href='/favorites']"));
        button.click();

        //WebElement shadow = (WebElement) js.executeScript("return arguments[0].shadowRoot", root);
        //WebElement header = shadow.findElement(By.tagName("app-header"));
        //WebElement toolbar = header.findElement(By.className("toolbar-bottom"));
        //WebElement bookInput = toolbar.findElement(By.tagName("book-input-decorator"));
        //bookInput.findElement(By.cssSelector("input#input")).sendKeys("NewBooks");


    }
}
