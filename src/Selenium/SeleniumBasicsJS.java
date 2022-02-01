package Selenium;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumBasicsJS {

    public static void main(String[] args) {
        WebDriver driver = SeleniumLearn.getDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement discountCoupon = driver.findElement(By.linkText("Discount Coupons"));
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        js.executeScript("arguments[0].scrollIntoView();",discountCoupon);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
}
