package steps;

import common.PopUp;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactPage;

public class ContactPageSteps extends ScenarioSteps {

    ContactPage sp;

    @Step("Test 1: Contact functionality")
    public void contactButtonFunctionality() {
        sp.selectContact();
    }

    @Step("Test 2: Contact elements are present")
    public void contactElements() {
        sp.contactElements();
    }

    @Step("Test 3: Successful contact form")
    public void succesfullContactForm() throws InterruptedException {
        sp.succesfullContact();
    }

    @Step("Test 4: Cancel button functionality")
    public void cancelButtonFunctionality() throws InterruptedException {
        sp.cancelButtonFunctionality();
    }

    @Step("Test 5: Contact form empty fields")
    public void contactEmptyFields() throws InterruptedException {
        sp.emptyFields();
    }

    @Step("Test 6: Contact form invalid credentials")
    public void contactInvalidCredentials () throws InterruptedException {
        sp.invalidCredentials();
    }

}