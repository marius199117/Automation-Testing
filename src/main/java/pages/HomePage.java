package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(css = "a.nav-link[href*=\"index.html\"]")
    WebElement home;

    @FindBy(id = "narvbarx")
    WebElement afterClick;

    // Test 1: Home button functionality
    public void selectHome() {
        home.click();
        Assert.assertTrue("Home button is not functional", afterClick.isDisplayed());
    }

}