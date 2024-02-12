package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class FlipSearch extends BaseClass {

    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.flipkart.com");
        System.out.println("--------" + getTitle() + "-------");
    }

    @Test
    public void flip() throws InterruptedException {

        driver.findElement(By.xpath("//button[text()='✕']")).click();

        driver.findElement((By.xpath("//input[@title='Search for products, brands and more']"))).sendKeys("iphone", Keys.ENTER);
//        Thread.sleep(5000);
        List<WebElement> purple = (List<WebElement>) driver.findElements(By.xpath("//div[contains(text(),'APPLE')]"));

        Thread.sleep(5000);
        System.out.println("size:" + purple.size());
        for (WebElement w : purple) {
            System.out.println(w.getText());

        }

    }
}
