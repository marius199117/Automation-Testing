package pages;

import common.Helper2;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends Helper2 {

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

    public static By footerInfo() {
        return By.xpath("//div[@id='footc']");
    }

    // Test 1: First page elements are displayed
    public void firstPageElements() {
        verifyAndAssertElement(title(), "Product Store is not displayed");
        verifyAndAssertElement(home(), "Home is not displayed");
        verifyAndAssertElement(contact(), "Contact is not displayed");
        verifyAndAssertElement(about(), "About is not displayed");
        verifyAndAssertElement(cart(), "Cart is not displayed");
        verifyAndAssertElement(logIn(), "Log in is not displayed");
        verifyAndAssertElement(signIn(), "Sign in is not displayed");
        verifyAndAssertElement(categories(), "Categories is not displayed");
        verifyAndAssertElement(slider(), "Slider is not displayed");
        verifyAndAssertElement(phones(), "Phones is not displayed");
        verifyAndAssertElement(laptops(), "Laptops are not displayed");
        verifyAndAssertElement(monitor(), "Monitor is not displayed");
        verifyAndAssertElement(previousButton(), "Previous is not displayed");
        verifyAndAssertElement(nextButton(), "Next button is not displayed");
        verifyAndAssertElement(footerInfo(), "Footer info is not displayed");
    }
}