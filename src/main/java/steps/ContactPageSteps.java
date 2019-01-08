package steps;

import common.PopUp;
import common.UserInfo;
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
    public void succesfullContactForm(String validEmail, String validName, String validMessage) {
        sp.succesfullContact(validEmail, validName, validMessage);
    }

    @Step("Test 4: Cancel button functionality")
    public void cancelButtonFunctionality() {
        sp.cancelButtonFunctionality();
    }

    @Step("Test 5: Contact form empty fields")
    public void contactEmptyFields() {
        sp.emptyFields();
    }

    @Step("Test 6: Contact form invalid credentials")
    public void contactInvalidCredentials() {

        UserInfo userInfo = new UserInfo().generateUser();
        sp.invalidCredentials(userInfo);
    }
}