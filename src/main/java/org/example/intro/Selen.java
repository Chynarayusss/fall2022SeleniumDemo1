package org.example.intro;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selen {

    static Faker faker = new Faker();

    @Test
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(faker.name().firstName());

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(faker.internet().emailAddress());

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(faker.address().city());

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(faker.address().buildingNumber());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        String expectedFakeName = driver.findElement(By.id("name")).getText();
        String expectedFakeEmail = driver.findElement(By.id("email")).getText();
        String expectedFakeAddress = driver.findElement(By.id("currentAddress")).getText();
        String expectedFakePerAdd = driver.findElement(By.id("permanentAddress")).getText();

        String name = "Chynara";
        String email = "Chynara@gmail.com";
        String address = "Kievskaya 100";
        String perAdd= "6789";

        assertEquals(faker.name().firstName(),name," You enter wrong name");
        assertEquals(faker.internet().emailAddress(),email, "You inter wrong");
        assertEquals(faker.address().city(),address, "You enter wrong address");
        assertEquals(faker.address().buildingNumber(),perAdd, "You enter wrong permanent address");

        driver.close();

    }

}