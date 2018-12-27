package common;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
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

    public void clickAndSendKeys (WebDriver ldriver, By element, String message, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement((By) element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) element)).sendKeys(message).build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysAndSelectButton (WebDriver ldriver, By element, String message, By element2, String message2, int time, By signUpButton) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement((By) element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) element2)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) element2)).sendKeys(message2).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) signUpButton)).click().build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysPasswordOrUsername (WebDriver ldriver, By element, String message, int time, By signUpButton) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement((By) element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement((By) signUpButton)).click().build().perform();
        waitABit(time);

    }

    public void selectSignUpAndAssertTrue (WebDriver ldriver, By element, int time, WebElement usernameField, WebElement passwordField, WebElement signUpButton, int time2) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement((By) element)).click().build().perform();
        waitABit(time);
        Assert.assertTrue("Username is not displayed", usernameField.isDisplayed());
        Assert.assertTrue("Password is not displayed", passwordField.isDisplayed());
        Assert.assertTrue("Sign Up is not displayed", signUpButton.isDisplayed());
        waitABit(time2);
    }
}

