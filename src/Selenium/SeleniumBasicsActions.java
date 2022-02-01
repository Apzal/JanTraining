package Selenium;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumBasicsActions {
    public static void main(String[] args) {
        WebDriver driver = SeleniumLearn.getDriver();

//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//        Actions actions = new Actions(driver);
//
//        actions.moveToElement(driver.findElement(By.id("mousehover")))
//                .build().perform();
//
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);


//        driver.navigate().to("https://www.facebook.com/");
//
//        Actions actions = new Actions(driver);
//
//        WebElement txtUserName = driver.findElement(By.id("email"));
//
//        actions.moveToElement(txtUserName)
//                .click()
//                .keyDown(Keys.SHIFT)
//                .sendKeys("abc@abc.com")
//                .keyUp(Keys.SHIFT)
//                .sendKeys(Keys.TAB)
//                .pause(Duration.ofSeconds(2))
//                .sendKeys("Test")
//                .pause(Duration.ofSeconds(2))
//                .sendKeys(Keys.TAB)
//                .pause(Duration.ofSeconds(1))
//                .sendKeys(Keys.TAB)
//                .click()
//                .build()
//                .perform();


        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(src,target)
                .build().perform();

        System.out.println(driver.findElement(By.xpath("//p[text()='Dropped!']")).isDisplayed());
        Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);



    }
}
