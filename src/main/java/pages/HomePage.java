package pages;

import common.Helper2;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends Helper2 {

    @FindBy(css = "a.nav-link[href*=\"index.html\"]")
    WebElement home;

    @FindBy(id = "narvbarx")
    WebElement afterClick;

    public static By home() {
        return By.cssSelector("a.nav-link[href*=\"index.html\"]");
    }

    // Test 1: Home button functionality
    public void selectHome() {
        clickElement(this.getDriver(), home(), 3000);
        element(afterClick).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Home button is not functional", afterClick.isDisplayed());
    }

}