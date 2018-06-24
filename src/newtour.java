import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class newtour
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");
        driver.findElement(By.name("firstName")).sendKeys("Meera");
        driver.findElement(By.name("lastName")).sendKeys("Shah");
        driver.findElement(By.name("phone")).sendKeys("07865456432");
        driver.findElement(By.id("userName")).sendKeys("nikitamray@yahoo.co.in");
        driver.findElement(By.name("address1")).sendKeys("102A");
        driver.findElement(By.name("address2")).sendKeys("Oxford Street");
        driver.findElement(By.name("city")).sendKeys("London");
        driver.findElement(By.name("state")).sendKeys("UK");
        driver.findElement(By.name("postalCode")).sendKeys("OX45 5RT");
        driver.findElement(By.id("email")).sendKeys("MeeraShah");
        driver.findElement(By.name("password")).sendKeys("Abc123");
        driver.findElement(By.name("confirmPassword")).sendKeys("Abc123");
        driver.findElement(By.name("register")).click();

        String ExpectedMessage = "sign-in";
        String ActualMessage = driver.findElement(By.xpath(".//*[@href ='mercurysignon.php']")).getText();
        System.out.println(driver.findElement(By.xpath(".//*[@href ='mercurysignon.php']")).getText());

        if (ActualMessage.equals(ExpectedMessage))
        {System.out.print("Test case is passed");}
        else {System.out.print("Test case is failed");}

        driver.close();
    }
}
