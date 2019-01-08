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


    @FindBy(css = "a.nav-link[data-target*=\"#exampleModal\"]")
    WebElement contact;

    @FindBy(className = "modal-content")
    WebElement afterClick;

    @FindBy(id = "recipient-email")
    WebElement contactEmailField;

    @FindBy(id = "recipient-name")
    WebElement contactNameField;

    @FindBy(id = "message-text")
    WebElement message;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    WebElement closeButton;

    @FindBy(css = "button.btn-primary[type*=\"button\"][onclick*=\"send()\"]")
    WebElement sendMessage;

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
        element(afterClick).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());

    }

    // Test 2: Contact elements are present
    public void contactElements() {
        clickElement(this.getDriver(), contact(), 3000);
        element(afterClick).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        element(contactEmailField).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Contact Email Field is not displayed", contactEmailField.isDisplayed());
        element(contactNameField).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Contact Name Field is not displayed", contactNameField.isDisplayed());
        element(closeButton).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Close button is not displayed", closeButton.isDisplayed());
        element(sendMessage).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Send Message is not displayed", sendMessage.isDisplayed());
    }

    // Test 3: Successful contact form
    public void succesfullContact(String validEmail, String validName, String validMessage) {
        clickElement(this.getDriver(), contact(), 3000);
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        clickAndSendKeys(this.getDriver(), contactEmailField(), validEmail, 3000);
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        clickAndSendKeys(this.getDriver(), contactNameField(), validName, 3000);
        clickAndSendKeys(this.getDriver(), message(), validMessage, 3000);
        clickElement(this.getDriver(), sendMessage(), 5000);
    }

    // Test 4: Cancel button functionality
    public void cancelButtonFunctionality() {
        clickElement(this.getDriver(), contact(), 3000);
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        clickElement(this.getDriver(), closeButton(), 3000);
    }

    // Test 5: Contact form empty fields
    public void emptyFields() {
        clickElement(this.getDriver(), contact(), 3000);
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        clickElement(this.getDriver(), sendMessage(), 3000);
    }

    // Test 6: Contact form invalid credentials
    public void invalidCredentials(UserInfo userInfo) {
        clickElement(this.getDriver(), contact(), 3000);
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        clickAndSendKeys(this.getDriver(), contactEmailField(), userInfo.invalidEmail, 3000);
        clickAndSendKeys(this.getDriver(), contactNameField(), userInfo.invalidName, 3000);
        clickAndSendKeys(this.getDriver(), message(), userInfo.invalidMessage, 3000);
        clickElement(this.getDriver(), sendMessage(), 3000);
    }
}


