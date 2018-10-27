package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends PageObject {

    @FindBy(css = "a.nav-link[data-target*=\"#videoModal\"]")
    WebElement aboutUs;

    @FindBy(className = "vjs-poster")
    WebElement afterClick;

    @FindBy(id = "example-video_html5_api")
    WebElement afterVideoClick;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/button")
    WebElement selectXButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button")
    WebElement selectCloseButton;


    // Test 1 : Select About Us and Select the video from the About Us section
    public void selectAboutUs() {
        aboutUs.click();
        Assert.assertTrue("About Us button is not functional", afterClick.isDisplayed());
        afterClick.click();
        Assert.assertTrue("Video is not functional", afterVideoClick.isDisplayed());

    }

    // Test 2 : Select About Us and X button
    public void selectAboutUsXbutton() {
        aboutUs.click();
        Assert.assertTrue("About Us button is not functional", afterClick.isDisplayed());
        selectXButton.click();
        selectXButton.click();

    }

    // Test 3 : Select About Us and Close button
    public void selectCloseAboutUs() {
        aboutUs.click();
        Assert.assertTrue("About Us button is not functional", afterClick.isDisplayed());
        selectCloseButton.click();
        selectCloseButton.click();

    }
}

