package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FirstPage;

public class FirstPageSteps extends ScenarioSteps {

    FirstPage sp;

    @Step("Test 1: First page elements are displayed")
    public void firstPageElements() {
        sp.firstPageElements();
    }
}