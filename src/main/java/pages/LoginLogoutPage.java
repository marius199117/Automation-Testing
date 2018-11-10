package pages;

import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutPage extends PageObject {

    @FindBy(css = "a.nav-link[data-target*=\"#logInModal\"]")
    WebElement logIn;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    //xpath trebuie simplificate / facute relative
    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
    WebElement closeButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    WebElement loginButton;

    @FindBy(id = "nameofuser")
    WebElement loginConfirmation;

    @FindBy(id = "logout2")
    WebElement logout;


    // Test 1: Login button functionality and elements are present
    public void loginElements() {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        Assert.assertTrue("Username field is not displayed", username.isDisplayed());
        Assert.assertTrue("Password field is not displayed", password.isDisplayed());
        Assert.assertTrue("Close Button is not displayed", closeButton.isDisplayed());
        Assert.assertTrue("Login Button is not displayed", loginButton.isDisplayed());
        waitABit(1000);
    }

    // Test 2: Successful login and logout
    public void successfulLogin(String user, String pass) {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        username.sendKeys(user);
        waitABit(3000);
        password.sendKeys(pass);
        waitABit(3000);
        loginButton.click();
        waitABit(3000);
        Assert.assertTrue("Login Confirmation is not functional", loginConfirmation.isDisplayed());
        waitABit(3000);
        logout.click();
        waitABit(3000);
        Assert.assertTrue("The user is not logged out", logIn.isDisplayed());

    }

    // Test 3: Empty fields login
    public void emptyFieldsLogin() {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        loginButton.click();
        waitABit(3000);
    }

    // Test 4: Empty field for username
    public void emptyUsernameField(String pass) {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        password.sendKeys(pass);
        loginButton.click();
        waitABit(3000);
    }

    // Test 5: Empty field for password
    public void emptyPasswordField(String user) {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        username.sendKeys(user);
        loginButton.click();
        waitABit(3000);
    }

    // Test 5: Invalid credentials (invalid username and password credentials)
    public void invalidCredentials(UserInfo userInfo) {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        username.sendKeys(userInfo.username);
        waitABit(3000);
        password.sendKeys(userInfo.password);
        loginButton.click();
        waitABit(3000);
    }

    // Test 6: Invalid credentials (valid username and password with a space afterwards)
    public void usernamePasswordSpaceAfterwards(UserInfo userInfo) {
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        waitABit(3000);
        username.sendKeys(userInfo.validUsernameBlankSpace);
        waitABit(3000);
        password.sendKeys(userInfo.validPasswordBlankSpace);
        waitABit(3000);
        loginButton.click();
        waitABit(3000);
    }

    // Test 7: Invalid credentials (


}