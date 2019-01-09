package pages;

import common.Helper2;
import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginLogoutPage extends Helper2 {

    public static By logIn() {
        return By.cssSelector("a.nav-link[data-target*=\"#logInModal\"]");
    }

    public static By username() {
        return By.id("loginusername");
    }

    public static By closeButton() {
        return By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    }

    public static By password() {
        return By.id("loginpassword");
    }

    public static By logInButton() {
        return By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    }

    public static By logout() {
        return By.id("logout2");
    }

    public static By loginConfirmation() {
        return By.id("nameofuser");
    }

    public static By logout2() {
        return By.id("nameofuser");
    }

    public static By afterLoginElements() {
        return By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]");
    }

    // Test 1: Login button functionality and elements are present
    public void loginElements() {
        clickElement(this.getDriver(), logIn(), 3000);
        Assert.assertTrue("Login Button is not functional", find(logIn()).isDisplayed());
        Assert.assertTrue("Username field is not displayed", find(username()).isDisplayed());
        Assert.assertTrue("Password field is not displayed", find(password()).isDisplayed());
        Assert.assertTrue("Close Button is not displayed", find(closeButton()).isDisplayed());
        Assert.assertTrue("Login Button is not displayed", find(logInButton()).isDisplayed());
    }

    // Test 2: Successful login and logout
    public void successfulLogin(String user, String pass) {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickAndSendKeys(this.getDriver(), username(), user, 3000);
        clickAndSendKeys(this.getDriver(), password(), pass, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
        clickElement(this.getDriver(), logout(), 3000);
        element(logIn()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("The user is not logged out", find(logIn()).isDisplayed());

    }

    // Test 3: Empty fields login
    public void emptyFieldsLogin() {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 4: Empty field for username
    public void emptyUsernameField(String pass) {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickAndSendKeys(this.getDriver(), password(), pass, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 5: Empty field for password
    public void emptyPasswordField(String user) {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickAndSendKeys(this.getDriver(), username(), user, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 5: Invalid credentials (invalid username and password credentials)
    public void invalidCredentials(UserInfo userInfo) {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickAndSendKeys(this.getDriver(), username(), userInfo.username, 3000);
        clickAndSendKeys(this.getDriver(), password(), userInfo.password, 3000);
    }

    // Test 6: Invalid credentials (valid username and password with a space afterwards)
    public void usernamePasswordSpaceAfterwards(UserInfo userInfo) {
        clickElement(this.getDriver(), logIn(), 3000);
        element(afterLoginElements()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("Sign Up is not functional", find(afterLoginElements()).isDisplayed());
        clickAndSendKeys(this.getDriver(), username(), userInfo.validUsernameBlankSpace, 3000);
        clickAndSendKeys(this.getDriver(), password(), userInfo.validPasswordBlankSpace, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 7: Invalid credentials (


}



