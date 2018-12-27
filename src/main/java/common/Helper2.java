package common;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

public class Helper2 extends PageObject {

    public void clickElement(WebDriver ldriver, By element, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement((By) element)).click().build().perform();
        waitABit(time);
    }

   public void sendKeys (WebDriver ldriver, By element, String message, int time) {
       Actions act = new Actions(ldriver);
       act.moveToElement(ldriver.findElement((By) element)).sendKeys(message).build().perform();
       waitABit(time);
   }
}
