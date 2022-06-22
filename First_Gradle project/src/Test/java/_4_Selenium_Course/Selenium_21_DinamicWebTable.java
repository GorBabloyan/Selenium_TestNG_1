package _4_Selenium_Course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Selenium_21_DinamicWebTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("demo");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[5]/ul/li[1]/a")).click();


        String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[2]")).getText();

        int pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
        System.out.println(pages);
        int sum = 0;
        for (int p = 2; p < 3; p++) {
            String active_page = driver.findElement(By.xpath("//ul[@class='pagination']//span")).getText();
            System.out.println("Active page: " + active_page);

            int rows = driver.findElements(By.xpath("//*[@id=\"form-order\"]/table/tbody//tr")).size();
            System.out.println("rows are " + rows);
            String page_num = Integer.toString(p);

            for (int i = 2; i <= rows; i++) {


                //String columnText = driver.findElement(By.xpath("//*[@id=\"form-order\"]/table//tr["+ i +"]//td[2]")).getText();
                String maney = driver.findElement(By.xpath("//*[@id=\"form-order\"]/table//tr[" + i + "]//td[5]")).getText();

                int mon = Integer.parseInt(maney.substring(maney.indexOf("$") + 1, maney.indexOf(".00"))); //$105.00

                sum = sum + mon;
                //System.out.println("text of Id " + columnText );

            }

            System.out.println(sum + " $");

            driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul//li//a[text()='" + page_num + "']"))
                    .click();
        }

        System.out.println();


        Thread.sleep(5000);
        //driver.quit();
    }
}
//ul[@class='pagination']//li//a[text()='4']