package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkXpath {

    WebDriver driver;

    @BeforeClass
    public void Work(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://glovoapp.com/");
    }

    @Test
    public void xpath1Test(){
        WebElement name1 = driver.findElement(By.xpath("(//button[@id='user-register'])[2]"));
        name1.click();
    }
    @Test
    public void xpath2Test(){
        WebElement inputFirstName = driver.findElement(By.xpath("(//input[@class='el-input__inner'])[2]"));
        inputFirstName.sendKeys("Chynara");
    }

   @Test
   public void xpath3Test(){
       WebElement inputEmail = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div/input"));
       inputEmail.sendKeys("chynarayus97@gmail.com");
    }
    @Test
    public void xpath4Test(){
        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("Patrisiya31");

    }
    @Test
    public void xpath5Test(){
        WebElement inputSent = driver.findElement(By.xpath("//*[@id=\"signup-button\"]"));
        inputSent.click();
    }
}