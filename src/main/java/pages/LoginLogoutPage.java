package pages;

import common.Helper2;
import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;

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
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");
        clickAndSendKeys(this.getDriver(), username(), user, 3000);
        clickAndSendKeys(this.getDriver(), password(), pass, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
        clickElement(this.getDriver(), logout(), 3000);
        element(logIn()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue("The user is not logged out", find(logIn()).isDisplayed());

    }

    // Test 3: Empty fields login
    public void emptyFieldsLogin() {
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 4: Empty field for username
    public void emptyUsernameField(String pass) {
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");
        clickAndSendKeys(this.getDriver(), password(), pass, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 5: Empty field for password
    public void emptyPasswordField(String user) {
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");
        clickAndSendKeys(this.getDriver(), username(), user, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 6: Invalid credentials (valid username and password with a space afterwards)
    public void usernamePasswordSpaceAfterwards(UserInfo userInfo) {
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");;
        clickAndSendKeys(this.getDriver(), username(), userInfo.validUsernameBlankSpace, 3000);
        clickAndSendKeys(this.getDriver(), password(), userInfo.validPasswordBlankSpace, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }

    // Test 7: Invalid credentials (digits username and password)
    public void digitsUsernamePassword (UserInfo userInfo) {
        selectAndAssertTrue(this.getDriver(), logIn(), 3000, afterLoginElements(), "Sign Up is not functional");
        clickAndSendKeys(this.getDriver(), username(), userInfo.usernameDigits, 3000);
        clickAndSendKeys(this.getDriver(), password(), userInfo.passwordDigits, 3000);
        clickElement(this.getDriver(), logInButton(), 3000);
    }
}



