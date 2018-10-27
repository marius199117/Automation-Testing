package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    HomePage sp;

    @Step("Test 1: Home functionality")
    public void homeButtonFunctionality() {
        sp.selectHome();
    }

}
