package Selenium;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ElementsIdentification {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        //radio buttons
//        driver.findElement(By.cssSelector("input[value='radio1']")).click();
//        driver.findElement(By.xpath("//input[@value='radio2']")).click();
//        driver.findElement(By.xpath("//input[@value='radio3' and @name='radioButton']")).click();



        //select dropdown
//        WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Option1");
//        select.selectByIndex(2);
//        select.selectByValue("option3");



        //Suggestion Box

//        WebElement suggestionBox = driver.findElement(By.id("autocomplete"));
//        suggestionBox.sendKeys("India"+ Keys.TAB);
//
//        suggestionBox.clear();
//
//        suggestionBox.sendKeys("Ind");
//
//        driver.findElement(By.xpath("//ul[@id='ui-id-1']//div[text()='India']")).click();


        //checkbox

//        driver.findElement(By.id("checkBoxOption1")).click();
//        driver.findElement(By.id("checkBoxOption3")).click();

        // New window
//
//        driver.findElement(By.id("openwindow")).click();
//        String currentWindow = driver.getWindowHandle();
//        System.out.println(driver.getTitle());
//        Set<String> windows= driver.getWindowHandles();
//        for(String window : windows){
//            driver.switchTo().window(window);
//            System.out.println(driver.getTitle());
//
//        }
//        driver.switchTo().window(currentWindow);
//        System.out.println(driver.getTitle());


        //New Tab

//        driver.findElement(By.id("opentab")).click();
//        String currentWindow = driver.getWindowHandle();
//        System.out.println(driver.getTitle());
//        Set<String> windows= driver.getWindowHandles();
//        for(String window : windows){
//            driver.switchTo().window(window);
//            System.out.println(driver.getTitle());
//
//        }
//        driver.switchTo().window(currentWindow);
//        System.out.println(driver.getTitle());

        //Alert

        driver.findElement(By.id("name")).sendKeys("QA");
        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        driver.findElement(By.id("checkBoxOption1")).click();

        alert.dismiss();

        driver.quit();

    }
}
