package Selenium_Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ByCSSClass extends BaseClass {


    @Test
    public void byid() {
        driver.get("https://www.icicibank.com/");
        driver.findElement(By.cssSelector(".ic-btn")).click();
    }
}
