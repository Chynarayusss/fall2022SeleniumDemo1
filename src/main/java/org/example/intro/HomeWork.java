package org.example.intro;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

public class HomeWork extends BaseTest{
    @Test
    public void test1(){
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName"));
        Faker faker = new Faker();
        String fName = faker.name().name();
        String lName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String age = String.valueOf(faker.number().randomDigit());
        String salary = String.valueOf(faker.number().randomDigit());
        String department = faker.job().field();

        WebElement fullNameInput = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email2 = driver.findElement(By.id("userEmail"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement salary2 = driver.findElement(By.id("salary"));
        WebElement department2 = driver.findElement(By.id("department"));

        fullNameInput.sendKeys(fName);
        lastName.sendKeys(lName);
        email2.sendKeys(email);
        ageInput.sendKeys(age);
        salary2.sendKeys(salary);
        department2.sendKeys(department);

        driver.findElement(By.id("submit")).click();

        List<WebElement> saveData = driver.findElements(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));

        for(WebElement j: saveData) {
            System.out.println(j.getText());
                Helper.pause(3000);
                System.out.println("----------------");
                break;
            }
        }
    }
