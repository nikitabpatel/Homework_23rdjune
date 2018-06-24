import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google
{
    static protected WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.id("firstName")).sendKeys("Meera");
        driver.findElement(By.id("lastName")).sendKeys("Shah");
        driver.findElement(By.id("username")).sendKeys("Meerashah2156");
        driver.findElement(By.name("Passwd")).sendKeys("Abc1234&");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Abc1234&");
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();
        driver.findElement(By.id("phoneNumberId")).sendKeys("07383987653");
        driver.findElement(By.id("gradsIdvPhoneNext")).click();

        //It will send verification code on given number and after that,
        driver.findElement(By.id("headingText")).sendKeys("");
        driver.findElement(By.xpath(".//*[@id='gradsIdvVerifyNext']/content/span")).click();

        // next page after verified mobile number
        driver.findElement(By.id("phoneNumberId")).sendKeys("07865432123");
        driver.findElement(By.xpath(".//*[@class='Xb9hP']")).sendKeys("nikitamray@yahoo.co.in");

        // now its asking for birthday and gender selection which we haven't learn yet so i am asking directly to click on Next
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();

        driver.findElement(By.xpath(".//*[@class='PkgjBf MbhUzd']")).click();
        driver.findElement(By.xpath(".//*[@class='rq8Mwb']")).click();
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();

        //now its asking me to enter password again to verify

        driver.findElement(By.name("password")).sendKeys("Abc1234&");
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();

        // it says account is disable so i take id locatore from there to get text

        driver.findElement(By.id("headingText")).getText();
    }
}
