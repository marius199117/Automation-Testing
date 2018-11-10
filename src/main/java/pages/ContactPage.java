package pages;

import com.sun.jna.platform.win32.Netapi32Util;
import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactPage extends PageObject {


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


    // Test 1: Contact button functionality
    public void selectContact() {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());

    }

    // Test 2: Contact elements are present
    public void contactElements() {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        Assert.assertTrue("Contact Email Field is not displayed", contactEmailField.isDisplayed());
        Assert.assertTrue("Contact Name Field is not displayed", contactNameField.isDisplayed());
        Assert.assertTrue("Close button is not displayed", closeButton.isDisplayed());
        Assert.assertTrue("Send Message is not displayed", sendMessage.isDisplayed());
    }

    // Test 3: Successful contact form
    public void succesfullContact(String validEmail, String ValidName, String validMessage) {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        waitABit(1000);
        contactEmailField.sendKeys(validEmail);
        waitABit(1000);
        contactNameField.sendKeys(ValidName);
        waitABit(1000);
        message.sendKeys(validMessage);
        waitABit(1000);
        sendMessage.click();
        waitABit(5000);
    }

    // Test 4: Cancel button functionality
    public void cancelButtonFunctionality() {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        closeButton.click();
    }

    // Test 5: Contact form empty fields
    public void emptyFields() {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        sendMessage.click();
    }

    // Test 6: Contact form invalid credentials
    public void invalidCredentials(UserInfo userInfo) {
        contact.click();
        Assert.assertTrue("Contact button is not functional", afterClick.isDisplayed());
        waitABit(1000);
        contactEmailField.sendKeys(userInfo.invalidEmail);
        waitABit(1000);
        contactNameField.sendKeys(userInfo.invalidName);
        waitABit(1000);
        message.sendKeys(userInfo.invalidMessage);
        waitABit(1000);
        sendMessage.click();
    }
}


