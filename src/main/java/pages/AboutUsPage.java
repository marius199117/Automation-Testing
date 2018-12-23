package pages;

import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AboutUsPage  {

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

//        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]"))).click().build().perform();
//        waitABit(3000);
//        act.moveToElement(driver.findElement(By.id("example-video_html5_api"))).click().build().perform();
//        waitABit(3000);
//        driver.quit();



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


