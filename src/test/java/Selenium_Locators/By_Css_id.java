package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class By_Css_id extends BaseClass {


    @Test
    public void byid() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphones", Keys.ENTER);

    }
}
