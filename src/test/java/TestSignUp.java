import common.Application;
import common.Constants;
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
import steps.SignUpSteps;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestSignUp {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private SignUpSteps step;

    private String url;

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
    @Title("Username and Password text is present")
    public void loginElements() throws InterruptedException {

        step.loginElements();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Sign Up functionality")
    public void successfulSignUp() throws InterruptedException {

        step.signUpFunctionality();
        Thread.sleep(1000);
        getDriver().quit();

    }

    @Test
    @Title("Sign up empty fields")
    public void signUpEmptyFields() throws InterruptedException {

        step.signUpEmptyFields();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Sign up username with valid credentials and empty password field")
    public void emptyPasswordFieldSignUp() throws InterruptedException {

        step.signUpEmptyPasswordField();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Empty field for username and valid credentials for password")
    public void emptyUsernameFieldSignUp() throws InterruptedException {

        step.signUpEmptyUsernameField();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Empty field for username and valid credentials for password")
    public void specialCharactersSignUp() throws InterruptedException {

        step.specialCharacters();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (special characters for username and password")
    public void digitsSignUp() throws InterruptedException {

        step.digits();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (select space to put blank space for username and password )")
    public void blankSpaceSignUp() throws InterruptedException {

        step.blankSpace();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (valid username and password and a blank space)")
    public void validCredentialsAndBlankSpaceSignUp() throws InterruptedException {

        step.validCredentialsAndBlankSpace();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (lowercase credentials for password")
    public void lowercaseCredentialsSignUp() throws InterruptedException {

        step.lowercaseCredentials();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Invalid credentials (uppercase credentials for password")
    public void upperCredentialsSignUp() throws InterruptedException {

        step.upperCaseCredentials();
        Thread.sleep(1000);
        getDriver().quit();
    }
}
