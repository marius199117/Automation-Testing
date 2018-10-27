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

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestLoginLogout {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private LoginLogoutPageSteps step;

    private String url;
    private String username;
    private String password;
    private String invalidUsername;
    private String invalidPassword;

    @Before
    public void setupBrowser() {
        //open url
        getDriver().get(url);

        // make sure the window is maximized
        getDriver().manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    @Test
    @Title("Login button functionality and elements are present")
    public void LoginFunctionalityAndElements() throws InterruptedException{

        step.loginElements();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Succesfull login")
    public void successfulLogin() throws InterruptedException{

        step.successfullLogin(username,password);
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Empty fields login")
    public void emptyFieldsLogin() throws InterruptedException{

        step.emptyfieldsLogin();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Empty field for username")
    public void emptyUsernameLogin() throws InterruptedException{

        step.emptyUsernameField();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Empty field for password")
    public void emptyPasswordLogin() throws InterruptedException{

        step.emptyPasswordField();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (invalid username and password credentials)")
    public void invalidCredentialsLogin() throws InterruptedException{

        step.invalidCredentials();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (valid username and password with a space afterwards)")
    public void usernamePasswordSpaceAfterwardsLogin() throws InterruptedException{

        step.usernamePasswordSpaceAfterwards(invalidUsername,invalidPassword);
        Thread.sleep(1000);
        getDriver().quit();
    }
}