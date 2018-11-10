package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginLogoutPage;

public class LoginLogoutPageSteps extends ScenarioSteps {

    LoginLogoutPage sp;

    @Step("Test 1: Login button functionality and elements are present")
    public void loginElements() {
        sp.loginElements();
    }

    @Step("Test 2: Succesfull login")
    public void successfullLogin(String user, String pass) {
        sp.successfulLogin(user, pass);
    }

    @Step("Test 3: Empty fields login")
    public void emptyfieldsLogin() {
        sp.emptyFieldsLogin();
    }

    @Step("Test 4: Empty field for username")
    public void emptyUsernameField(String pass) {
        sp.emptyUsernameField(pass);
    }

    @Step("Test 4: Empty field for password")
    public void emptyPasswordField(String user) {
        sp.emptyPasswordField(user);
    }

    @Step("Test 5: Invalid credentials (invalid username and password credentials)")
    public void invalidCredentials() {
        UserInfo userInfo = new UserInfo();
        sp.invalidCredentials(userInfo);
    }

    @Step("Test 6: Invalid credentials (valid username and password with a space afterwards")
    public void usernamePasswordSpaceAfterwards() {
        UserInfo userInfo = new UserInfo();
        sp.usernamePasswordSpaceAfterwards(userInfo);
    }
}
