package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

import java.util.List;

public class ByTagname extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.google.in");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links: " + links.size());
        for (WebElement link : links) {
            System.out.println(link.getText() + " --> " + link.getAttribute("href"));
        }


    }
}
