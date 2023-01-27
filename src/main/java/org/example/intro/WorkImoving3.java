package org.example.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WorkImoving3 extends BaseTest {
    @Test
    public void test() {
        driver.get("https://www.imoving.com/full-inventory/#!/");
        WebElement houseMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseMenu);
        select.selectByVisibleText("My Apartment");
        Helper.pause(3000);

        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        Helper.pause(3000);

        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        Helper.pause(3000);

        WebElement continuesBox = driver.findElement(By.xpath("//span[@class='col-sm-9 col-xs-12']"));
        continuesBox.click();
        Helper.pause(3000);

        driver.findElement(By.xpath("//div[@class='modal-buttons']/a")).click();
        Helper.pause(3000);
        driver.findElement(By.id("closeTutorial")).click();

        Actions action = new Actions(driver);
        WebElement pictureDresser = driver.findElement(By.xpath("//div[@class='14']//figure"));
        action.moveToElement(pictureDresser).build().perform();
        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);


        WebElement plusBoxDresser = driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']"));
        action.doubleClick(plusBoxDresser).perform();
        Helper.pause(3000);

        WebElement bedImageContainer = driver.findElement(By.xpath("//div[@class='13']//figure"));
        action.moveToElement(bedImageContainer).build().perform();
        driver.findElement(By.xpath("//div[@class='13']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);

        WebElement plusBoxBed = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[3]"));
        action.doubleClick(plusBoxBed).perform();

        WebElement tvImageContainer = driver.findElement(By.xpath("//div[@class='12']//figure"));
        action.moveToElement(tvImageContainer).build().perform();
        driver.findElement(By.cssSelector("div[class='12'] div[class='add-item-mob visible-xs-block visible-sm-block'] a[class='btn btn-blue']")).click();
        Helper.pause(3000);

        WebElement plusBoxTv = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[5]"));
        action.doubleClick(plusBoxTv).perform();

        WebElement complete = driver.findElement(By.xpath("//h3[text()='Complete Order']"));
        complete.click();





//        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[2]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[5]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[8]")).click();
        driver.findElement(By.xpath("//a[text()='Add and Continue']")).click();


        WebElement restrictions = driver.findElement(By.xpath("(//button[text()='Restrictions'])[1]"));
        restrictions.click();


        



//        WebElement kitchenContainer = driver.findElement(By.xpath("(//div[@class='quantity-module hidden-xs hidden-sm'])[4]"));
//        action.moveToElement(kitchenContainer).build().perform();
//        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[7]"));
//        Helper.pause(3000);

    }
}