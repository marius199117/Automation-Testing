package steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PlaceOrderPage;

public class PlaceOrderSteps extends ScenarioSteps {
    PlaceOrderPage sp;

    @Step("Test 1: Successful order placement")
    public void successfulOrderPlacement() {
        sp.placeOrderFlow();
    }
}
