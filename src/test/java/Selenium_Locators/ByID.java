package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ByID extends BaseClass {


    @Test
    public void byid() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones", Keys.ENTER);
    }
}
