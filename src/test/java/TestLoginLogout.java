import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.Application;
import common.Constants;
import steps.LoginLogoutPageSteps;

import java.util.concurrent.TimeUnit;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestLoginLogout extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private LoginLogoutPageSteps step;
    private String url;
    private String username;
    private String password;


    @Before
    public void setupBrowser() {
        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    @Test
    @Title("Login button functionality and elements are present")
    public void LoginFunctionalityAndElements() {

        step.loginElements();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Succesfull login")
    public void successfulLogin() {

        step.successfullLogin(username, password);
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Empty fields login")
    public void emptyFieldsLogin() {

        step.emptyfieldsLogin();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Empty field for username")
    public void emptyUsernameLogin() {

        step.emptyUsernameField(password);
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Empty field for password")
    public void emptyPasswordLogin() {

        step.emptyPasswordField(username);
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid credentials (invalid username and password credentials)")
    public void invalidCredentialsLogin() throws InterruptedException {

        step.invalidCredentials();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid credentials (valid username and password with a space afterwards)")
    public void usernamePasswordSpaceAfterwardsLogin() {

        step.usernamePasswordSpaceAfterwards();
        waitABit(1000);
        driver.quit();
    }
}