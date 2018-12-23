package pages;

import common.Helper;
import common.Helper2;
import gherkin.lexer.Pa;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutUsPage extends Helper2 {

    WebDriver driver;

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
        Helper2.clickByCss(driver,"a.nav-link[data-target*=\"#videoModal\"]");




//        Webdriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver,3);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]")));
//        aboutUs.click();
//        Assert.assertTrue("About Us button is not functional", afterClick.isDisplayed());
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-video_html5_api")));
//        afterVideoClick.click();
//        Assert.assertTrue("Video is not functional", afterClick.isDisplayed());
//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        waitABit(2000);
//        clickAndAssert(afterClick, afterVideoClick, "Video is not functional");
    }

    //    // Test 2 : Select About Us and X button
//    public void selectAboutUsXbutton() {
//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectXButton);
//    }
//
//    // Test 3 : Select About Us and Close button
//    public void selectCloseAboutUs() {
//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectCloseButton);
//    }
}

