package _4_Selenium_Course.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Locators_1 extends Elements {
    Locators_1(String browser, String url) {
        super(browser, url);
    }
    public static void main(String[] args) throws InterruptedException {
        String browser= "chrome";
        String url = "https://www.amazon.in/";
        Locators_1 loc = new Locators_1(browser,url);
        List<WebElement> links  = loc.driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link:links){
            System.out.println(link.getText());
        }
        //LOCATORS

//        driver.findElement(id(""));
//        driver.findElement(name(""));
//        driver.findElement(linkText(""));
//        driver.findElement(partialLinkText(""));
//        driver.findElement(className(""));
//        driver.findElement(tagName(""));
//
//        driver.findElement(xpath(""));
//        driver.findElement(cssSelector("tag_name#id_name"));

        //cssSelectors

//        driver.findElement(cssSelector("tag_name#id_name"));              //tagName with Id               // input is tag name and id  ("tag#id") or ("#id")
//        driver.findElement(cssSelector("tag_name.class_name"));           //tagName with className        // input is tag name and class  ("tag.class") or (".class")
//        driver.findElement(cssSelector("tag_name(input)[name=email]"));   //tagName with attribute        // input is tag name and attribute(it's can be everything name, class, placeholder) ("tag(input)[name=email]") or ("[name = email]")
//      Tag,Class,Attributes
//        driver.findElement(cssSelector("input(tagName).inputText(className)[name=email(attribute)]"));  // input is tag name and email is id  ("tag#id") or ("#id")


        //SHADOW ROOT HANDLING

//        WebElement root = driver.findElement(By.xpath("//book-app[contains(text(),'BOOKS')]"))
//                .getShadowRoot()
//                .findElement(By.className("toolbar-top"))
//                .findElement(By.className("menu-btn"));
//        root.click();


    //        XPath AXES
//        SELF              "Xpath /self::a"
//        PARENT            "Xpath /parent::td"
//        CHILD             "Xpath /child::*"  // * will show all child's
//        ANCESTOR          "Xpath /ancestor::tr" grandfather
//        DESCENDANT        "Xpath /descendant::div" child of child
//        FOLLOWING         after self all
//        FOLLOWING-SIBLING after self all with inTags objects
//        PRECEDING         before self all
//        PRECEDING-SIBLING before self all with inTags objects

//        @FindBy(className = "classname")
//        @FindBy(css = "css")
//        @FindBy(id = "id")
//        @FindBy(how = How.ID_OR_NAME, using ="idOrName")
//        @FindBy(linkText= "text")
//        @FindBy(name= "name")
//        @FindBy(partialLinkText= "text")
//        @FindBy(tagName="tagName")
//        @FindBy(xpath="xpath")




        Thread.sleep(8000);
        //driver.quit();
    }
}
