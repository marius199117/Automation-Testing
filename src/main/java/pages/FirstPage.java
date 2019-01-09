package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {

    public static By title() {
        return By.id("nava");
    }

    public static By home() {
        return By.cssSelector("a.nav-link[href*=\"index.html\"]");
    }

    public static By contact() {
        return By.cssSelector("a.nav-link[data-target*=\"#exampleModal\"]");
    }

    public static By about() {
        return By.cssSelector("a.nav-link[href*=\"cart.html\"]");
    }

    public static By cart() {
        return By.cssSelector("a.nav-link[data-target*=\"#videoModal\"]");
    }

    public static By logIn() {
        return By.cssSelector("a.nav-link[data-target*=\"#logInModal\"]");
    }

    public static By signIn() {
        return By.cssSelector("a.nav-link[data-target*=\"#signInModal\"]");
    }

    public static By categories() {
        return By.cssSelector("#cat.list-group-item");
    }

    public static By slider() {
        return By.cssSelector(".carousel-inner");
    }

    public static By phones() {
        return By.cssSelector(".list-group-item[onclick=\"byCat('phone')\"]");
    }

    public static By laptops() {
        return By.cssSelector(".list-group-item[onclick=\"byCat('phone')\"]");
    }

    public static By monitor() {
        return By.cssSelector(".list-group-item[onclick=\"byCat('notebook')\"]");
    }

    public static By previousButton() {
        return By.id("prev2");
    }

    public static By nextButton() {
        return By.id("next2");
    }

    // Test 1: First page elements are displayed
    public void firstPageElements() {
        Assert.assertTrue("Product Store is not displayed", find(title()).isDisplayed());
        Assert.assertTrue("Home is not displayed", find(home()).isDisplayed());
        Assert.assertTrue("Contact is not displayed", find(contact()).isDisplayed());
        Assert.assertTrue("About is not displayed", find(about()).isDisplayed());
        Assert.assertTrue("Cart is not displayed", find(cart()).isDisplayed());
        Assert.assertTrue("Log in is not displayed", find(logIn()).isDisplayed());
        Assert.assertTrue("Sign in is not displayed", find(signIn()).isDisplayed());
        Assert.assertTrue("Categories is not displayed", find(categories()).isDisplayed());
        Assert.assertTrue("Slider is not displayed", find(slider()).isDisplayed());
        Assert.assertTrue("Phones is not displayed", find(phones()).isDisplayed());
        Assert.assertTrue("Laptops is not displayed", find(laptops()).isDisplayed());
        Assert.assertTrue("Monitor is not displayed", find(monitor()).isDisplayed());
        Assert.assertTrue("Previous button is not displayed", find(previousButton()).isDisplayed());
        Assert.assertTrue("Next button is not displayed", find(nextButton()).isDisplayed());
    }
}