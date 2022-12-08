import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;

public class MyKongaProject {
    //support the chrome driver
    private WebDriver driver;
    @BeforeTest
    public void start() throws InterruptedException {
        //locate the chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/ChromeDriver_win32/chromedriver.exe");
        //1. Open Chrome Browser
        driver = new ChromeDriver();
        //2. input the konga URL https://www.konga.com/
        driver.get("https://www.konga.com/");
        //3.Maximize the browser
        driver.manage().window().maximize();
        //4. the page title
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/nav/div[1]/div[1]/a[2]/picture/img"));
    }

    @Test
    public void login() throws InterruptedException {

        //5.click on the sign in/login button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        //6. input my email address
        driver.findElement(By.id("username")).sendKeys("sadacab681@dmonies.com");
        //7. input password in the password field
        driver.findElement(By.id("password")).sendKeys("admin123456789");
        //8. click on the sign in/login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public void logout() throws InterruptedException {
        //9.click my account in nav bar
       driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div")).click();
        //10.click on log out from account
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]")).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeBrowser(){
        //10. quit the browser
        driver.quit();
    }

}
