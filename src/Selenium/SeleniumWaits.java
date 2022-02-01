package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = SeleniumLearn.getDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.openhrms.com/web/login");


        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Log in']")).submit();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Marc Demo']")));

        System.out.println(ele.getText());





//        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Marc Demo']")));
//        System.out.println(ele.isDisplayed());

//        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement ele2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password")));

        driver.quit();
    }
}
