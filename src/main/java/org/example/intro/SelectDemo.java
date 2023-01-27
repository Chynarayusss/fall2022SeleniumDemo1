package org.example.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectDemo extends BaseTest{
    @Test
    public void testSelect(){

        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).click();

    }
}
