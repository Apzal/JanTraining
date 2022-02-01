package Selenium;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumLearn {
    public static WebDriver getDriver(){
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\driver\\chromedriver.exe");
        return new ChromeDriver();
    }
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\driver\\chromedriver.exe");
        String[] passwords = {"admin","admin123"};
        WebDriver driver=null;
        for(String password:passwords){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.navigate().to("http://demo.openhrms.com/web/login");
            driver.findElement(By.id("login")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).submit();
            boolean userLoggedIn = false;



            try {
                userLoggedIn = driver.findElement(By.xpath("//span[text()='Marc Demo']")).isDisplayed();
                System.out.println("User Logged In " + userLoggedIn);
            }

            catch (Exception e){
                System.out.println("I am in catch");
            }
            finally {
                System.out.println("I am in finally");
            }

            WebElement element = driver.findElement(By.id("dropdown-class-example"));
            Select dropdown = new Select(element);
            dropdown.selectByValue("option1");
            dropdown.selectByIndex(1);
            dropdown.selectByVisibleText("Option1");

            driver.switchTo().frame(0);
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("test")).click();
            driver.switchTo().parentFrame();


            driver.quit();

        }







    }
}
