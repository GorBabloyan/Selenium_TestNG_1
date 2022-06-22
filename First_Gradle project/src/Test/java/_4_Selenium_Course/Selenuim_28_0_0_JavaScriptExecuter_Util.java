package _4_Selenium_Course;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenuim_28_0_0_JavaScriptExecuter_Util {

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border = '3px solid red'",element);
    }

    public static String getTitleByJS (WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String title = js.executeScript("return document.title;").toString();
        return  title;
    }

    public static void clickElementByJS(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);

    }

    public static void generateAlert(WebDriver driver,String massage){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('"+ massage +"')");
    }

    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("history.go(0)");
    }

    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void  scrollPageUp(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    public static void  zoomPageByJS(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='150%'"); //zoom by 100%
    }

    public static void flashByjs(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i<100; i++){
            changeColor("#000000",element, driver);
            changeColor(bgcolor,element,driver);
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor= '"+ color +"'", element);
        try {
            Thread.sleep(200);
        }
        catch (Exception e){}

    }







}
