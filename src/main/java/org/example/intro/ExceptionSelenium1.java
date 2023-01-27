package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ExceptionSelenium1 extends BaseTest {
    @Test
    public void demo1() {
        //NoSuchElementsExceptions
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Hello World");
    }
    @Test
    public void noSuchWindowExceptions() {
        // noSuchWindowExceptions
        browserHelper.openURL("https://demoqa.com/text-box");
        browserHelper.switchToWindow(5);
    }
    @Test
    public void noSuchFrameExceptions() {
        //NoSuchFrameException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(123);
    }
    @Test
    public void noSuchAlertExceptionTest() {
        // NoSuchAlertException
        browserHelper.openURL("https://demoqa.com/text-box");
        AlertHelper alertHelper;
    }
    @Test
    public void InvalidSelectorExceptions() {
        browserHelper.openURL("https://demoqa.com/text-box");
        SessionId s = ((RemoteWebDriver) driver).getSessionId();
        System.out.println("Session Id is: " + s);
        driver.findElement(By.xpath("//button[@type='button'][100]"));
    }
    @Test
    public void NoSuchSessionExceptions() {
        //NoSuchSessionExceptions
        driver.quit();
        browserHelper.openURL("https://demoqa.com/text-box");
    }
    @Test
    public void staleElementReferenceExceptionTest() {
        //staleElementReferenceExceptionTest
        browserHelper.openURL("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();
            }
        }
    }
    @Test
    public void timeOutExceptionTest() {
        //timeOutExceptionTest
        browserHelper.openURL("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();
    }

    @Test
    public void test123() {

        //Element Not Interactable
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).click();
    }
    @Test
    public void elementNotInteractableException() {
        driver.get("https://www.etsy.com/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
        loginButton.click();
        Helper.pause(2000);
        WebElement careersLink = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        careersLink.click();
    }
}
