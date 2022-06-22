package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_32_DataBaceTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.sendKeys("Gor11");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.sendKeys("Gor");
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("gor11@mail.ru");
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        phone.sendKeys("123456");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("123456");
        WebElement passwordConfirm = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        passwordConfirm.sendKeys("123456");
        WebElement privacy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        privacy.click();
        WebElement login = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        login.click();

        try {
            String confirmMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
            System.out.println(confirmMessage);
            if (confirmMessage.equals("Your Account Has Been Created!")) {
                System.out.println("Your account successfully created");
            } else {
                System.out.println("There is some problem: Please check Warning message ");
            }

            WebElement warning = driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
            System.out.println(warning.getText());
        }
        catch (Exception e) {

        }
        //For DATABase testing see in https://www.youtube.com/watch?v=97Qh1AH9mtw&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=32 lesson

//        Connection con = DriverManager.getConnection("","","");


//        Thread.sleep(3000);
//        driver.quit();

    }
}
