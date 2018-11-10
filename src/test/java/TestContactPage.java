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
import steps.ContactPageSteps;

import java.util.concurrent.TimeUnit;


@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestContactPage extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private ContactPageSteps step;

    private String url;
    private String validEmail;
    private String validName;
    private String validMessage;

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
    @Title("Contact functionality")
    public void contactButtonFunctionality() {

        step.contactButtonFunctionality();
        waitABit(1000);
        driver.quit();

    }

    @Test
    @Title("Contact Elements")
    public void contactElements() {

        step.contactElements();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Contact Form")
    public void succesfullContactForm() {

        step.succesfullContactForm(validEmail, validName, validMessage);
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Contact - Cancel button functionalityZ")
    public void cancelButtonFunctionality() {

        step.cancelButtonFunctionality();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Contact form empty fields")
    public void ContactEmptyFields() {

        step.contactEmptyFields();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Contact form invalid credentials")
    public void ContactInvalidCredentials() {

        step.contactInvalidCredentials();
        waitABit(1000);
        driver.quit();
    }
}
