package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutUsPage extends PageObject {

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

    // Test 1 : Select About Us and Select the video from the About Us section
    public void selectAboutUs() {

        Actions act = new Actions(this.getDriver());
        act.moveToElement(this.getDriver().findElement(aboutUs())).click().build().perform();
        waitABit(3000);
        act.moveToElement(this.getDriver().findElement(afterClick())).click().build().perform();
        waitABit(3000);

//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        waitABit(2000);
//        clickAndAssert(afterClick, afterVideoClick, "Video is not functional");
    }

    // Test 2 : Select About Us and X button
    public void selectAboutUsXbutton() {

        Actions act = new Actions(this.getDriver());
        act.moveToElement(this.getDriver().findElement(By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]"))).click().build().perform();
        waitABit(3000);
        act.moveToElement(this.getDriver().findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button"))).click().build().perform();
        waitABit(3000);
//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectXButton);
    }

    //
    // Test 3 : Select About Us and Close button
    public void selectCloseAboutUs() {
        Actions act = new Actions(this.getDriver());
        act.moveToElement(this.getDriver().findElement(By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]"))).click().build().perform();
        waitABit(3000);
        act.moveToElement(this.getDriver().findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button"))).click().build().perform();
        waitABit(3000);
//        clickAndAssert(aboutUs, afterClick, "About Us button is not functional");
//        click(selectCloseButton);


    }
}



