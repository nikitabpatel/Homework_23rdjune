import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tools
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
        driver.findElement(By.id("name_3_firstname")).sendKeys("Meera");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Shah");
        driver.findElement(By.name("radio_4[]")).click();
        driver.findElement(By.name("checkbox_5[]")).click();
        driver.findElement(By.id("phone_9")).sendKeys("07865765432");
        driver.findElement(By.id("username")).sendKeys("Meerashah1");
        driver.findElement(By.id("email_1")).sendKeys("nikitamray@yahoo.co.in");
        driver.findElement(By.id("description")).sendKeys("I am Meera Shah and love dancing.");
        driver.findElement(By.id("password_2")).sendKeys("Abc12345&");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("Abc12345&");
        driver.findElement(By.name("pie_submit")).click();

        String ExpectedMessage = "entry-title";
        String ActualMEssage = driver.findElement(By.xpath(".//*[@class='entry-title']")).getText();

        if (ExpectedMessage.equals(ActualMEssage))
        {System.out.print("Your Test case passed");}
        else {System.out.print("Your Test case failed");}

        driver.close();
    }
}
