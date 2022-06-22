package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Selenium_15_GetWindowHandle {

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/es/");

        // getWindowHandle()
        String windowId = driver.getWindowHandle();   // return id of browser window
        System.out.println(windowId);
        driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[5]/div[1]/div/a/img")).click();

        //getWindowHandles
        Set<String> windowIds = driver.getWindowHandles();  //returns Ids of Browser windows

        //Firs method to capture web windows ids

//        Iterator<String> it = windowIds.iterator();
//        String ParentWindowId = it.next();
//        String ChildWindowId = it.next();

        // second method to capture web window ids

        List<String> winIdList = new  ArrayList(windowIds);
        String ParentWindowId = winIdList.get(0);
        String ChildWindowId = winIdList.get(1);

//        System.out.println("Id_1 " + ParentWindowId);
//        System.out.println("Id_2 " + ChildWindowId);

        //Haw use ids to switch windows
        driver.switchTo().window(ParentWindowId);
        System.out.println("Page_1 title: " + driver.getTitle());
        driver.switchTo().window(ChildWindowId);
        System.out.println("Page_1 title: " + driver.getTitle());

        for (String wid:winIdList){
            String a = driver.switchTo().window(wid).getTitle();
            if (a.contains("Sistema de")){
                driver.close();
            }
        }
        //driver.close(); // will close pointed browser window
        //driver.quit();  //all browser windows will be closed




    }
}
