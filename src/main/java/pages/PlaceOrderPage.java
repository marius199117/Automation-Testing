package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")
    WebElement product1;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
    WebElement addToCartButton;

    @FindBy(id = "cartur")
    WebElement cartOption;

    @FindBy(css = "a.nav-link[data-target*=\"#logInModal\"]")
    WebElement logIn;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
    WebElement closeButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    WebElement loginButton;

    @FindBy(id = "nameofuser")
    WebElement loginConfirmation;

    @FindBy(id = "logout2")
    WebElement logout;


    // Test 1: Successful order placement
    public void placeOrderFlow() throws Exception {

//        LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
//        loginLogoutPage.successfulLogin();
        logIn.click();
        Assert.assertTrue("Login Button is not functional", logIn.isDisplayed());
        Thread.sleep(2000);
        username.sendKeys("Marius91!");
        Thread.sleep(3000);
        password.sendKeys("Marius91!");
        Thread.sleep(3000);
        loginButton.click();
        Thread.sleep(3000);
        product1.click();
        Thread.sleep(5000);
        addToCartButton.click();
        Thread.sleep(7000);
        cartOption.click();
        Thread.sleep(5000);
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();
        waitABit(3000);
        
    }
}