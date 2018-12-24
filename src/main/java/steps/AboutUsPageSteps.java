package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AboutUsPage;

public class AboutUsPageSteps extends ScenarioSteps {

    AboutUsPage sp;

    @Step("Test 1: Select About Us and Select the video from the About Us section")
    public void aboutUsButtonFunctionality() {
        sp.selectAboutUs();
    }

    @Step("Test 2: Select Contact and afterwards Select X button")
    public void aboutUsXbutton() {
        sp.selectAboutUsXbutton();
    }

    @Step("Test 3: Select Contact and afterwards Select Close button")
    public void aboutUsClosebutton() {
        sp.selectCloseAboutUs();
    }
}