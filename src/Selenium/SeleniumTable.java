package Selenium;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTable {
    public static void main(String[] args) {
        WebDriver driver = SeleniumLearn.getDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //get all headers for course
//        System.out.println("---------------------------------");
//        List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='courses']//th"));
//        for (WebElement header:tableHeader) {
//            System.out.println(header.getText());
//
//        }
//
//        System.out.println("---------------------------------------");
//        //get rows
//        int count = driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
//        // 11 -> 0 to 10
//        for (int i = 1; i <= count; i++) {
//            List<WebElement> datarows = driver.findElements(By.xpath("//table[@name='courses']//tr["+i+"]//td"));
//            for (WebElement dr:datarows) {
//                System.out.print(dr.getText()+" ");
//            }
//            System.out.println();
//
//
//
//        }

        //frames

       JavascriptExecutor js =(JavascriptExecutor) driver;

       js.executeScript("window.scrollBy(0,1000)","");

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        driver.switchTo().frame(0);

        boolean accesPlanDisplayed = driver.findElement(By.xpath("//a[text()='All Access plan']")).isDisplayed();
        System.out.println(accesPlanDisplayed);

        driver.switchTo().defaultContent();
        List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='courses']//th"));
        System.out.println(tableHeader.size());

        driver.quit();

    }
}
