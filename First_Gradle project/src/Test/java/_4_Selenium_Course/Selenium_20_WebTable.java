package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_20_WebTable {
    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //Finding size of rows
        int columns = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr")).size();
        System.out.println("The rows are: " + columns);
        //Finding size of columns
        int rows = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr/th")).size();
        System.out.println("The columns are: " + rows);
        //Finding specific row/column value
        String el = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[6]/td[3]")).getText();
        System.out.println("The value is " + el);
        //Printing all values

        /*for (int r = 1; r<=columns; r++){
            for (int c = 1; c<=rows; c++){
                try {
                    String value = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr["+r+"]/td["+c+"]")).getText();
                    System.out.print(value + " - ");
                   // Thread.sleep(1000);
                }
                catch (Exception e){

                }

            }
            System.out.println();
        }*/
List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody//tr"));
for (WebElement element:elements){
    if(element.getText().contains("Germany")) {
        System.out.println(element.getText());
        break;
    }
}
//try{
//            for (int i = 1; i <= rows-1; i++) {
//
//
//
//                    String value = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td[3]")).getText();
//                    if (value.equals("Germany")){
//                     //   String v1 = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/td[" + i + "]")).getText();
//                       // String v2 = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/td[" + i + "]")).getText();
//                        System.out.print(value + " - ");
//                    }
//                    else{
//                        System.out.println("I cant find Germany");
//                    }
//
//                    // Thread.sleep(1000);
//            }
//}
//catch (Exception e){}


        driver.quit();
    }
}
