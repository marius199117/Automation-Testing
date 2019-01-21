package common;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

import java.util.concurrent.TimeUnit;

import static pages.ContactPage.afterClick;

public class Helper2 extends PageObject {

    public void clickElement(WebDriver ldriver, By element, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
    }

    public void sendKeys(WebDriver ldriver, By element, String message, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
    }

    public void clickAndSendKeys(WebDriver ldriver, By element, String message, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysAndSelectButton(WebDriver ldriver, By element, String message, By element2, String message2, int time, By signUpButton) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element2)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element2)).sendKeys(message2).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(signUpButton)).click().build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysPasswordOrUsername(WebDriver webDriver, By element, String message, int time, By signUpButton) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(webDriver.findElement(signUpButton)).click().build().perform();
        waitABit(time);
    }

    public void selectAndAssertTrue(WebDriver webDriver, By element, int time, By element2, String message) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        element(element2).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(message, find(element2).isDisplayed());

    }

    public void verifyAndAssertElement(By element, String message) {
        element(element).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(message, find(element).isDisplayed());
    }
}