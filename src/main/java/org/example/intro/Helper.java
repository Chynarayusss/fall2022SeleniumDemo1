package org.example.intro;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Helper {

        private static JavascriptExecutor js;



        public static void pause(Integer milliseconds) {
            try {
                TimeUnit.MILLISECONDS.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void jsClick(WebDriver driver, WebElement element){
            JavascriptExecutor js =(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",element);
        }
        public static void jsScrollDownThePage(WebDriver driver,String pixels){
            js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,"+ pixels + ")", "");

        }

        public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
            TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
            File DestFile=new File(fileWithPath);
//Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
        }
    }


