package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SignUpPage;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage sp;

    @Step("Test 1: Username and Password text is present")
    public void loginElements() throws InterruptedException {
        sp.loginElements();
    }

    @Step("Test 2 : Successful sign up")
    public void signUpFunctionality() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.successfulSignUp(userInfo);
    }

    @Step("Test 3 : Empty fields sign up")
    public void signUpEmptyFields() throws InterruptedException {
        sp.emptyFieldsSignUp();
    }

    @Step("Test 4: Valid credentials for username and empty field for password")
    public void signUpEmptyPasswordField() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.emptyFieldForPasswordSignUp(userInfo);
    }

    @Step("Test 5: Empty field for username and valid credentials for password")
    public void signUpEmptyUsernameField() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.emptyFieldForUsernameSignUp(userInfo);
    }

    @Step("Test 6: Invalid credentials (special characters for username and password)")
    public void specialCharacters() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.specialCharactersSignUp(userInfo);
    }

    @Step("Test 7: Invalid credentials (Digits for username and password)")
    public void digits() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.digitsSignUp(userInfo);
    }

    @Step("Test 8: Invalid credentials (select space to put blank space for username and password )")
    public void blankSpace() throws InterruptedException {
        sp.blankSpaceSignUp();
    }

    @Step(" Test 9: Invalid credentials (valid username and password and a blank space)")
    public void validCredentialsAndBlankSpace() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.validCredentialsAndBlankSpaceSignUp(userInfo);
    }

    @Step("Test 10: Invalid credentials (lowercase credentials for password")
    public void lowercaseCredentials() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.lowercaseCredentials(userInfo);
    }

    @Step("Test 11: Invalid credentials (uppercase credentials for password)")
    public void upperCaseCredentials() throws InterruptedException {
        UserInfo userInfo = new UserInfo().generateUser();
        sp.uppercaseCredentials(userInfo);
    }
}
