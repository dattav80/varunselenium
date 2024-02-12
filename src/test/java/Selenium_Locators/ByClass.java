package Selenium_Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ByClass extends BaseClass {


    @Test
    public void byid() {
        driver.get("https://www.icicibank.com/");
        driver.findElement(By.className("ic-btn")).click();
    }
}
