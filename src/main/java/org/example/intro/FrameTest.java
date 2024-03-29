package org.example.intro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class FrameTest extends BaseTest{

    @Test
    public void test1(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame(2);
        WebElement text1 = driver.findElement(By.id("sampleHeading"));
        System.out.println(text1.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        WebElement test2 = driver.findElement(By.id("sampleHeading"));
        System.err.println(test2.getText());
        driver.switchTo().defaultContent();
        WebElement test3 = driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']"));
        System.out.println(test3.getText());

    }
}
