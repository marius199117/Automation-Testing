import common.Application;
import common.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SignUpSteps;

import java.util.concurrent.TimeUnit;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestSignUp extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private SignUpSteps step;
    private String url;

    @Before
    public void setupBrowser() {
        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    @After
    public void waitAndQuit () {
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Username and Password text is present")
    public void loginElements() {

        step.loginElements();
    }

    @Test
    @Title("Sign Up functionality")
    public void successfulSignUp() {

        step.signUpFunctionality();
    }

    @Test
    @Title("Sign up empty fields")
    public void signUpEmptyFields() {

        step.signUpEmptyFields();
    }

    @Test
    @Title("Sign up username with valid credentials and empty password field")
    public void emptyPasswordFieldSignUp() {

        step.signUpEmptyPasswordField();
    }

    @Test
    @Title("Empty field for username and valid credentials for password")
    public void emptyUsernameFieldSignUp() {

        step.signUpEmptyUsernameField();
    }

    @Test
    @Title("Empty field for username and valid credentials for password")
    public void specialCharactersSignUp() {

        step.specialCharacters();
    }

    @Test
    @Title("Invalid credentials (special characters for username and password")
    public void digitsSignUp() {

        step.digits();
    }

    @Test
    @Title("Invalid credentials (select space to put blank space for username and password )")
    public void blankSpaceSignUp() {

        step.blankSpace();
    }

    @Test
    @Title("Invalid credentials (valid username and password and a blank space)")
    public void validCredentialsAndBlankSpaceSignUp() {

        step.validCredentialsAndBlankSpace();
    }

    @Test
    @Title("Invalid credentials (lowercase credentials for password")
    public void lowercaseCredentialsSignUp() {

        step.lowercaseCredentials();
    }

    @Test
    @Title("Invalid credentials (uppercase credentials for password")
    public void upperCredentialsSignUp() {

        step.upperCaseCredentials();
    }
    }
