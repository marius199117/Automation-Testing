package pages;

import common.Helper;
import common.Helper2;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends Helper2 {

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

    public static By aboutUs() {
        return By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]");
    }

    public static By afterClick() {
        return By.className("vjs-poster");
    }

    public static By xButton() {
        return By.xpath("/html/body/div[4]/div/div/div[1]/button");
    }

    public static By closeButton() {
        return By.xpath("/html/body/div[4]/div/div/div[3]/button");
    }

    // Test 1 : Select About Us and Select the video from the About Us section
    public void selectAboutUs() {
        clickElement(this.getDriver(), aboutUs(), 2000);
        clickElement(this.getDriver(), afterClick(), 2000);

//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        waitABit(2000);
//        clickAndAssert(afterClick, afterVideoClick, "Video is not functional");
    }

    // Test 2 : Select About Us and X button
    public void selectAboutUsXbutton() {
        clickElement(this.getDriver(), aboutUs(), 2000);
        clickElement(this.getDriver(), xButton(), 2000);

//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectXButton);
    }

    //
    // Test 3 : Select About Us and Close button
    public void selectCloseAboutUs() {
        clickElement(this.getDriver(), aboutUs(), 2000);
        clickElement(this.getDriver(), closeButton(), 2000);

//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectCloseButton);


    }
}

