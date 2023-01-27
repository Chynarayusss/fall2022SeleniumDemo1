package org.example.intro;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AlertHelper {

    private WebDriver driver;
    private Alert alert;

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void acceptAlert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        alert.dismiss();
    }

    public void sendKeysAlert(String text) {
        driver.switchTo().alert();
        alert.sendKeys(text);


    }
}



