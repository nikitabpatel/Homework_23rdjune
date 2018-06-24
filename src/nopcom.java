import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class nopcom
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/register");
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Meera");
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        driver.findElement(By.id("Email")).sendKeys("meerashah2156@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Autosystem");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Abc1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc1234");
        driver.findElement(By.id("register-button")).click();

        String ExpectedMessage = "Your registration completed";
        String ActualMessage = driver.findElement(By.xpath(".//*[@class='result']")).getText();

        System.out.println(driver.findElement(By.xpath(".//*[@class='result']")).getText());

        if (ExpectedMessage.equals(ActualMessage))
        { System.out.print("Yout Test case passed");}
        else { System.out.print("Your Test case failed");}

        driver.close();
    }
}
