package common;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper extends PageObject {

//    public void click(WebElement element) {
//        waitFor(element).waitUntilVisible();
//        waitFor(element).waitUntilClickable();
//        element.click();
//    }

    public void clickAndAssert(WebElement findElement, WebElement expectedElement, String message) {
//        click(findElement);
        waitFor(expectedElement).waitUntilClickable();
        Assert.assertTrue(message, expectedElement.isDisplayed());

    }
}