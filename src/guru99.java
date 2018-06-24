import javafx.stage.PopupWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class guru99
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");
        driver.findElement(By.name("uid")).sendKeys("mngr139305");
        driver.findElement(By.name("password")).sendKeys("ErYquvY");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
        driver.findElement(By.name("name")).sendKeys("Meera");
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.name("addr")).sendKeys("3 Oxford Street, OX2 1NG");
        driver.findElement(By.name("city")).sendKeys("London");
        driver.findElement(By.name("state")).sendKeys("UK");
        driver.findElement(By.name("pinno")).sendKeys("OX2 1NG");
        driver.findElement(By.name("telephoneno")).sendKeys("07865765345");
        driver.findElement(By.name("emailid")).sendKeys("nikitamray@yahoo.co.in");
        driver.findElement(By.name("password")).sendKeys("Abcdefg");
        driver.findElement(By.name("sub")).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.close();

    }
}
