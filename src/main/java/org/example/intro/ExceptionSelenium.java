package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.example.intro.HomeWork1.StepFirst.driver;

public class ExceptionSelenium extends BaseTest {
    @Test
    public void test(){
        browserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).click();

    }
    @Test
    public void closePopUpWindow(){
        browserHelper.openURL("https://www.imoving.com/");
        WebElement selectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(selectMenu);
        select.selectByVisibleText("My House");
        Select select1 = new Select(driver.findElement(By.id("hp-nav-select-house")));
        select1.selectByVisibleText("Just a few Items");
        driver.findElement(By.xpath("//button[text()='Compare Quotes']")).click();
        Helper.pause(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-blue col-xs-6']")).click();
        Helper.pause(3000);
        driver.findElement(By.xpath(".//a[@id='closeTutorial']")).click();
        Helper.pause(3000);
    }








}
