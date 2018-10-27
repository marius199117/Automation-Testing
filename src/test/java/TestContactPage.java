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

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestContactPage  {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private ContactPageSteps step;

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
    @Title("Contact functionality")
    public void contactButtonFunctionality() throws InterruptedException {

        step.contactButtonFunctionality();
        Thread.sleep(1000);
        getDriver().quit();

    }

    @Test
    @Title("Contact Elements")
    public void contactElements() throws InterruptedException {

        step.contactElements();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Contact Form")
    public void succesfullContactForm() throws InterruptedException {

        step.succesfullContactForm();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Contact - Cancel button functionalityZ")
    public void cancelButtonFunctionality() throws InterruptedException {

        step.cancelButtonFunctionality();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Contact form empty fields")
    public void ContactEmptyFields() throws InterruptedException {

        step.contactEmptyFields();
        Thread.sleep(1000);
        getDriver().quit();
    }

    @Test
    @Title("Contact form invalid credentials")
    public void ContactInvalidCredentials() throws InterruptedException {

        step.contactInvalidCredentials();
        Thread.sleep(1000);
        getDriver().quit();
    }
}
