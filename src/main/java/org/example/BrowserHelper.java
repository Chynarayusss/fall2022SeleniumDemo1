package org.example;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {

    private WebDriver driver; //через драйвер будем переключаться на другие окошки

    public BrowserHelper(WebDriver driver){
        this.driver = driver;
    }
    public void openURL(String URL){
        driver.navigate().to(URL);

    }
    public void goBack(){

    }
    public void goForward(){
        driver.navigate().forward();

    }
    public void refreshThePage(){
        driver.navigate().refresh();

    }
    public Set<String> getWindowHandles(){     //новые вкладки будет класть в set чтобы не было дубликатов
        return driver.getWindowHandles(); //будет возвращать все новые вкладки

    }
    public void switchToWindow(int index){ //переключается между вкладками
        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandles()); //чтобы проиндексировать все Табы
        if (index < 0 || index >= windowsId.size()){
            throw  new IllegalArgumentException("Invalid index:" + index);
        }
        driver.switchTo().window(windowsId.get(index));//переключится на заданный индекс
    }

}
