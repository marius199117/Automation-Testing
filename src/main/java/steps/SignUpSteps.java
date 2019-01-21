package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SignUpPage;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

    @Step("Test 1: Username and Password text is present")
    public void loginElements() {
        signUpPage.loginElements();
    }

    @Step("Test 2 : Successful sign up")
    public void signUpFunctionality() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.successfulSignUp(userInfo);
    }

    @Step("Test 3 : Empty fields sign up")
    public void signUpEmptyFields() {
        signUpPage.emptyFieldsSignUp();
    }

    @Step("Test 4: Valid credentials for username and empty field for password")
    public void signUpEmptyPasswordField() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.emptyFieldForPasswordSignUp(userInfo);
    }

    @Step("Test 5: Empty field for username and valid credentials for password")
    public void signUpEmptyUsernameField() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.emptyFieldForUsernameSignUp(userInfo);
    }

    @Step("Test 6: Invalid credentials (special characters for username and password)")
    public void specialCharacters() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.specialCharactersSignUp(userInfo);
    }

    @Step("Test 7: Invalid credentials (Digits for username and password)")
    public void digits() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.digitsSignUp(userInfo);
    }

    @Step("Test 8: Invalid credentials (select space to put blank space for username and password )")
    public void blankSpace() {
        signUpPage.blankSpaceSignUp();
    }

    @Step(" Test 9: Invalid credentials (valid username and password and a blank space)")
    public void validCredentialsAndBlankSpace() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.validCredentialsAndBlankSpaceSignUp(userInfo);
    }

    @Step("Test 10: Invalid credentials (lowercase credentials for password")
    public void lowercaseCredentials() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.lowercaseCredentials(userInfo);
    }

    @Step("Test 11: Invalid credentials (uppercase credentials for password)")
    public void upperCaseCredentials() {
        UserInfo userInfo = new UserInfo().generateUser();
        signUpPage.uppercaseCredentials(userInfo);
    }
}
