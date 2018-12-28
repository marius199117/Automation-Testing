package pages;

import common.Helper2;
import common.UserInfo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Helper2 {


    @FindBy(css = "a.nav-link[data-target*=\"#signInModal\"]")
    WebElement signUp;

    @FindBy(css = "a.nav-link[data-dismiss*=\"modal\"]")
    WebElement closeButton;

    @FindBy(id = "sign-username")
    WebElement usernameField;

    @FindBy(id = "sign-password")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[2]")
    WebElement signUpButton;

    public static By signUp() {
        return By.cssSelector("a.nav-link[data-target*=\"#signInModal\"]");
    }

    public static By usernameField() {
        return By.id("sign-username");
    }

    public static By passwordField() {
        return By.id("sign-password");
    }

    public static By signUpButton() {
        return By.cssSelector("a.nav-link[data-target*=\"#signInModal\"]");
    }

    public static By closeButton() {
        return By.cssSelector("a.nav-link[data-dismiss*=\"modal\"]");
    }


    // Test 1: Username and Password text is present
    public void loginElements() {
        clickElement (this.getDriver(), signUp(), 2000);
    }

    // Test 2 : Successful sign up
    public void successfulSignUp(UserInfo userInfo) {

        clickElement (this.getDriver(), signUp(), 2000);
        clickAndSendKeys(this.getDriver(), usernameField(), userInfo.username, 2000);
        clickAndSendKeysPasswordOrUsername(this.getDriver(), passwordField(), userInfo.password, 2000, signUpButton());
        clickElement(this.getDriver(), signUpButton(), 2000);
    }

    // Test 3 : Empty fields sign up
    public void emptyFieldsSignUp() {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not displayed", signUp.isDisplayed());
        clickElement(this.getDriver(), signUpButton(), 2000);
    }

    // Test 4: Username field with valid credentials and empty field for password
    public void emptyFieldForPasswordSignUp(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not displayed", signUp.isDisplayed());
        clickAndSendKeysPasswordOrUsername(this.getDriver(), usernameField(), userInfo.username, 2000, signUpButton());
    }

    // Test 5: Username field with valid credentials and empty field for password
    public void emptyFieldForUsernameSignUp(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysPasswordOrUsername(this.getDriver(), usernameField(), userInfo.password, 2000, signUpButton());
    }

    // Test 6: Invalid credentials (special characters for username and password)
    public void specialCharactersSignUp(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), userInfo.username, passwordField(), userInfo.password, 2000, signUpButton());
    }

    // Test 7: Invalid credentials (Digits for username and password)
    public void digitsSignUp(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), userInfo.usernameDigits, passwordField(), userInfo.passwordDigits, 2000, signUpButton());
    }

    // Test 8: Invalid credentials (select space to put blank space for username and password )
    public void blankSpaceSignUp() {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), " ", passwordField(), " ", 2000, signUpButton());
    }

    // Test 9: Invalid credentials (valid username and password and a blank space)
    public void validCredentialsAndBlankSpaceSignUp(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), userInfo.validUsernameBlankSpace, passwordField(), userInfo.validPasswordBlankSpace, 2000, signUpButton());
    }

    // Test 10: Invalid credentials (lowercase credentials for password)
    public void lowercaseCredentials(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), userInfo.username, passwordField(), userInfo.passwordLowercaseCredentials, 2000, signUpButton());
    }

    // Test 11: Invalid credentials (uppercase credentials for password)
    public void uppercaseCredentials(UserInfo userInfo) {
        clickElement (this.getDriver(), signUp(), 2000);
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        clickAndSendKeysAndSelectButton(this.getDriver(), usernameField(), userInfo.username, passwordField(), userInfo.passwordUppercaseCredentials, 2000, signUpButton());
    }
}
