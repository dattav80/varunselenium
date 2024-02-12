package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class Scroll extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.amazon.in/");

        Thread.sleep(2000);
        WebElement backToTop = driver.findElement(By.xpath("//span[contains(@class,'navFooterBackToTopText')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", backToTop);
        Thread.sleep(5000);
        backToTop.click();

        Generic.takeScreenshot(driver);
    }
}
