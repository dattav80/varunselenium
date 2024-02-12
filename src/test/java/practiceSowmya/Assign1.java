package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Assign1 extends BaseClass {
    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.amazon.com");
        System.out.println("--------Amazon opened-------");
    }

    @Test
    public void as1() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 13 256 GB");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> l = driver.findElements(By.tagName("a"));
        for (WebElement cl : l) {
            String a = cl.getText();
            if (a.equals("Apple iPhone 13 Pro Max, 256GB, Gold - Unlocked (Renewed)")) {
                WebElement price = driver.findElement(By.className("a-price-whole"));
                System.out.println("Price of iPhone:" + price.getText());
                System.exit(0);
            }

        }

    }
}
