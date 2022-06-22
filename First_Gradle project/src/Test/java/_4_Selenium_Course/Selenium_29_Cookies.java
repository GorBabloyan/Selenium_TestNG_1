package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Selenium_29_Cookies {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().maximize();

        //Haw to capture cookies from browser
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of cookies = " + cookies.size());

        //Haw to print cookies from browser
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + "  " + cookie.getValue());
        }

        //Haw to add/delete cookies to/from browser
        Cookie cookieobj = new Cookie("MyCookie","123456");
        driver.manage().addCookie(cookieobj);

        cookies = driver.manage().getCookies();
        System.out.println("Size of cookies = " + cookies.size());
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + "  " + cookie.getValue()+ "    After adding");
        }

        //driver.manage().deleteCookie(cookieobj); //or
        driver.manage().deleteCookieNamed("MyCookie");
        cookies = driver.manage().getCookies();
        System.out.println("Size of cookies = " + cookies.size());
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + "  " + cookie.getValue() + "   After delating");
        }


        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Size of cookies = " + cookies.size());
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + "  " + cookie.getValue() + "   After delateing");
        }


        driver.quit();
    }
}
