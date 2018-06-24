import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Phptravel
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/register");
        driver.findElement(By.name("firstname")).sendKeys("Meera");
        driver.findElement(By.name("lastname")).sendKeys("Shah");
        driver.findElement(By.name("phone")).sendKeys("07866789654");
        driver.findElement(By.name("email")).sendKeys("meerashah21@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("Abc123");
        driver.findElement(By.name("confirmpassword")).sendKeys("Abc123");
        driver.findElement(By.xpath(".//*[@type='submit']")).click();

        String ExpectedMessage = "Hi, Meera Shah";
        String ActualMessage = driver.findElement(By.xpath(".//*[@class='RTL']")).getText();

        if (ExpectedMessage.equals(ActualMessage))
        { System.out.print("Your Test case is pass");}
        else { System.out.print("Your Test case is Fail");}

        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

        driver.close();


    }
}
