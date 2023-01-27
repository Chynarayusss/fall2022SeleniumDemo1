package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CssDemo extends BaseTest{

    @Test
    public void cssTest(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

        //findElement - находит только один элемент
        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
        System.out.println(appleText);

        List<WebElement>allBrands = driver.findElements(By.xpath("//*[@id=\"brandsRefinements\"]"));
        for (WebElement e: allBrands) {
            System.out.println(e.getText());{
                if (e.getText().contains("SAMSUNG")) {
                    driver.findElement(By.xpath("//*[@id=\"p_89/SAMSUNG\"]/span/a/div/label/i")).click();
                }
            }
        }
    }
}
