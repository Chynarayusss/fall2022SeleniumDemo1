package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WorkImoving1 extends BaseTest{


    @Test
    public void imovingTest(){
        driver.get("https://www.imoving.com/full-inventory/#!/");
        WebElement houseMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseMenu);
        select.selectByVisibleText("My Apartment");
        Helper.pause(3000);

        WebElement houseSize = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(houseSize);
        select2.selectByVisibleText("Just a few Items");
        Helper.pause(3000);

        WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        click.click();
        Helper.pause(3000);

        WebElement continues = driver.findElement(By.xpath("//span[@class='col-sm-9 col-xs-12']"));
        continues.click();
        Helper.pause(3000);

        driver.findElement(By.xpath("//div[@class='modal-buttons']/a")).click();
        Helper.pause(3000);
        driver.findElement(By.id("closeTutorial")).click();

        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();

        WebElement doubleClick = driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();

        WebElement picture = driver.findElement(By.xpath("//div[@class='11']//div[@class='item']"));
        actions.moveToElement(picture);
        actions.click();
        actions.perform();


        WebElement doubleClick2 = driver.findElement(By.cssSelector("div[class='13'] div[class='add-item-mob visible-xs-block visible-sm-block'] a[class='btn btn-blue']"));

        doubleClick2.click();



        driver.findElement(By.xpath("//div[@class='12']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']")).click();




//        WebElement doubleClick3 = driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']"));
//        actions.doubleClick(doubleClick3);



















    }
}
