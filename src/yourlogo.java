import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class yourlogo {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email_create")).sendKeys("nikitamray@yahoo.co.in");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("uniform-id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Meera");
        driver.findElement(By.id("customer_lastname")).sendKeys("Shah");
        //driver.findElement(By.id("email")).sendKeys("nikitamray@yahoo.co.in");
        driver.findElement(By.id("passwd")).sendKeys("Abc123");
        driver.findElement(By.id("firstname")).sendKeys("Meera");
        driver.findElement(By.id("lastname")).sendKeys("Shah");
        driver.findElement(By.id("address1")).sendKeys("3 oxford street");
        driver.findElement(By.id("address1")).sendKeys("London");
        driver.findElement(By.id("postcode")).sendKeys("OX23 6GH");
        driver.findElement(By.id("phone_mobile")).sendKeys("07654235776");
        driver.findElement(By.id("alias")).sendKeys("Myaddress");
        driver.findElement(By.id("submitAccount")).click();

        String ExpectedMessage = "There are 3 errors";
        String ActualMessage = driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText();
        System.out.println(driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText());

        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.print("Your test is pass");
        } else {
            System.out.print("Your test is fail");
        }

        driver.close();

    }
}