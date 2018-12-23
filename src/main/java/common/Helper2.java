package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

public class Helper2 {

    public static void clickByCss (WebDriver ldriver, String lid)

    {
            Actions act = new Actions(ldriver);
            act.moveToElement(ldriver.findElement(By.cssSelector(lid))).click().build().perform();
        }
}
