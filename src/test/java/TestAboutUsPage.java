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

import common.Application;
import common.Constants;
import steps.AboutUsPageSteps;

import java.util.concurrent.TimeUnit;


@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class TestAboutUsPage extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private AboutUsPageSteps step;

    private String url;

    @Before
    public void setupBrowser() {
        //open url
        getDriver().get(url);

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
    @Title("About Us button functionality")
    public void aboutUsFlowFunctionality() {

        step.aboutUsButtonFunctionality();
    }

    @Test
    @Title("About Us X button functionality")
    public void aboutUsXButtonFunctionality() {

        step.aboutUsXbutton();
    }

    @Test
    @Title("About Us Close button functionality")
    public void aboutUsCloseButtonFunctionality() {

        step.aboutUsClosebutton();
    }
}
