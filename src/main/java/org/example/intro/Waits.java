package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits extends BaseTest{
    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");
        WebElement enable = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//ждем 5 сек, чтобы кнопка появилась
        wait.until(ExpectedConditions.elementToBeClickable(enable)).click();//ждем пока кнопка будет кликабельной
    }

}
