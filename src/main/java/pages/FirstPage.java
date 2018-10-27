package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {

    @FindBy(id = "nava")
    WebElement title;

    @FindBy(css = "a.nav-link[href*=\"index.html\"]")
    WebElement home;

    @FindBy(css = "a.nav-link[data-target*=\"#exampleModal\"]")
    WebElement contact;

    @FindBy(css = "a.nav-link[data-target*=\"#videoModal\"]")
    WebElement about;

    @FindBy(css = "a.nav-link[href*=\"cart.html\"]")
    WebElement cart;

    @FindBy(css = "a.nav-link[data-target*=\"#logInModal\"]")
    WebElement logIn;

    @FindBy(css = "a.nav-link[data-target*=\"#signInModal\"]")
    WebElement signIn;

    @FindBy(css = "#cat.list-group-item")
    WebElement categories;

    @FindBy(css = ".carousel-inner")
    WebElement slider;

    @FindBy(css = ".list-group-item[onclick=\"byCat('phone')\"]")
    WebElement phones;

    @FindBy(css = ".list-group-item[onclick=\"byCat('notebook')\"]")
    WebElement laptops;

    @FindBy(css = ".list-group-item[onclick=\"byCat('notebook')\"]")
    WebElement monitor;

    @FindBy(id = "prev2")
    WebElement previousButton;

    @FindBy(id = "next2")
    WebElement nextButton;


    // Test 1: First page elements are displayed
    public void firstPageElements() {
        Assert.assertTrue("Product Store is not displayed", title.isDisplayed());
        Assert.assertTrue("Home is not displayed", home.isDisplayed());
        Assert.assertTrue("Contact is not displayed", contact.isDisplayed());
        Assert.assertTrue("About is not displayed", about.isDisplayed());
        Assert.assertTrue("Cart is not displayed", cart.isDisplayed());
        Assert.assertTrue("Log in is not displayed", logIn.isDisplayed());
        Assert.assertTrue("Sign in is not displayed", signIn.isDisplayed());
        Assert.assertTrue("Categories is not displayed", categories.isDisplayed());
        Assert.assertTrue("Slider is not displayed", slider.isDisplayed());
        Assert.assertTrue("Phones is not displayed", phones.isDisplayed());
        Assert.assertTrue("Laptops is not displayed", laptops.isDisplayed());
        Assert.assertTrue("Monitor is not displayed", monitor.isDisplayed());
        Assert.assertTrue("Previous button is not displayed", previousButton.isDisplayed());
        Assert.assertTrue("Next button is not displayed", nextButton.isDisplayed());
    }
}