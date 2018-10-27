package common;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUp {

    WebDriver driver;

    public void popup() {
        //getDriver().switchTo().alert().accept(); -- ok
        // getDriver().switchTo().alert().dismiss(); -- cancel
        //in cazu in care nu mai merge mai departe, trebe facut switchto windowu tau
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        //Assert.assertEquals("PopUp is not displayed", text.equals("Thanks for the message!!"));
        alert.accept();


    }
}

