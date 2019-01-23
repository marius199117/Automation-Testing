package pages;

import com.sun.jna.platform.win32.Netapi32Util;
import common.Helper;
import common.Helper2;
import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class ContactPage extends Helper2 {

    public static By contact() {
        return By.cssSelector("a.nav-link[data-target*=\"#exampleModal\"]");
    }

    public static By afterClick() {
        return By.cssSelector("a.nav-link[data-target*=\"#exampleModal\"]");
    }

    public static By contactEmailField() {
        return By.id("recipient-email");
    }

    public static By contactNameField() {
        return By.id("recipient-name");
    }

    public static By message() {
        return By.id("message-text");
    }

    public static By sendMessage() {
        return By.cssSelector("button.btn-primary[type*=\"button\"][onclick*=\"send()\"]");
    }

    public static By closeButton() {
        return By.xpath("/html/body/div[1]/div/div/div[3]/button[1]");
    }

    // Test 1: Contact button functionality
    public void selectContact() {

        clickElement(this.getDriver(), contact(), 3000);
        element(afterClick()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Contact button is not functional", find(afterClick()).isDisplayed());
    }

    // Test 2: Contact elements are present
    public void contactElements() {
        selectAndAssertTrue(this.getDriver(), contact(), 3000, afterClick(), "Contact button is not functional");
        verifyAndAssertElement(contactEmailField(), "Contact Email Field is not displayed");
        verifyAndAssertElement(contactNameField(), "Contact Name Field is not displayed");
        verifyAndAssertElement(closeButton(), "Close button is not displayed");
        verifyAndAssertElement(sendMessage(), "Send Message is not displayed");
    }

    // Test 3: Successful contact form
    public void succesfullContact(String validEmail, String validName, String validMessage) {
        selectAndAssertTrue(this.getDriver(), contact(), 3000, afterClick(), "Contact button is not functional");
        clickAndSendKeys(this.getDriver(), contactEmailField(), validEmail, 3000);
        clickAndSendKeys(this.getDriver(), contactNameField(), validName, 3000);
        clickAndSendKeys(this.getDriver(), message(), validMessage, 3000);
        clickElement(this.getDriver(), sendMessage(), 5000);
    }

    // Test 4: Cancel button functionality
    public void cancelButtonFunctionality() {
        selectAndAssertTrue(this.getDriver(), contact(), 3000, afterClick(), "Contact button is not functional");
        clickElement(this.getDriver(), closeButton(), 3000);
    }

    // Test 5: Contact form empty fields
    public void emptyFields() {
        selectAndAssertTrue(this.getDriver(), contact(), 3000, afterClick(), "Contact button is not functional");
        clickElement(this.getDriver(), sendMessage(), 3000);
    }

    // Test 6: Contact form invalid credentials
    public void invalidCredentials(UserInfo userInfo) {
        selectAndAssertTrue(this.getDriver(), contact(), 3000, afterClick(), "Contact button is not functional");
        clickAndSendKeys(this.getDriver(), contactEmailField(), userInfo.invalidEmail, 3000);
        clickAndSendKeys(this.getDriver(), contactNameField(), userInfo.invalidName, 3000);
        clickAndSendKeys(this.getDriver(), message(), userInfo.invalidMessage, 3000);
        clickElement(this.getDriver(), sendMessage(), 3000);
    }
}


