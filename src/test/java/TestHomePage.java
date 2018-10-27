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
import steps.HomePageSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestHomePage {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver webdriver;

    @Steps
    private HomePageSteps step;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        getDriver().get(url);

        // make sure the window is maximized
        getDriver().manage().window().maximize();
    }

    @Test
    @Title("Empty fields login")
    public void emptyFieldsLogin() throws InterruptedException {

        step.homeButtonFunctionality();
        Thread.sleep(1000);
        getDriver().quit();

    }
}

