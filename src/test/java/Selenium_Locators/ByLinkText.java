package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ByLinkText extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.google.in");

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Divyashree Republic of whitefield", Keys.ENTER);
    }
}
