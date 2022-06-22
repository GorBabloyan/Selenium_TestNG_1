package _4_Selenium_Course;


//class methods{
//    double d = 0;
//    void calculation_1(int i, int j, float f){
//         d = (i + j) * f;
//            }
//    void display(){
//        System.out.println("Calculated d ="+d);
//    }
//
//    int calculation_2(int a, int b, float c){
//        c = (a + b) * c;
//        return (int) c;
//    }
//}


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Review {
//    public static int sum(int k) {
//        while (k > 0) {
//            return k + sum(k - 1);
//
//        }
//
//        return 0;}



    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        driver.findElement(By.xpath("//*[@id=\"input-country\"]")).click();
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"input-country\"]"));

        Select Categories = new Select (ele);
        List<WebElement> elves = Categories.getOptions();
                //Categories.selectByIndex(8);
        int i=0;
        for (WebElement option: elves){

            System.out.println(i + "-" + option.getText());
            i++;
            if (option.getText().equals("Armenia")){
                option.click();
                option.getTagName();
                break;
            }

        }

        driver.findElement(By.xpath("//*[@id=\"input-country\"]")).click();
       // System.out.println("text is: " + Categories.getOptions());

        //manuAll.selectByVisibleText("£ Pound Sterling");
        //driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
       // System.out.println("Array element size is " + manuAll.getOptions());

//        String a;
//        a = ele.getText();
//        System.out.print("Text is: " + a);

//
//        int result = sum(10);
//        System.out.println("This is Result " + result);


//       methods m = new methods();
//       double q =m.calculation_2(1,2,3.0f);
//       System.out.println(q);
//       m.calculation_1(1,2,3.0f);
//       m.display();




    }
}
