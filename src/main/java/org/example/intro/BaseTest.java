package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;
    BrowserHelper browserHelper;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // сохраняем элемент
        driver = new ChromeDriver(); // управляем браузером(весь процесс с браузером в роли посредника это driver
        driver.manage().window().maximize(); // просим открыть на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // даем 20 секунд на открытие сайтаёи
        browserHelper = new BrowserHelper(driver);


    }
    @AfterClass
    public void tearTest2(){
//        driver.close();
//        driver.quit();
    }
}
