package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Assign2 extends BaseClass {

    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.tripadvisor.in/");
        System.out.println("--------Tri[Advisor opened-------");
    }

    @Test
    public void as2() {
        driver.findElement(By.className("qjfqs _G B- z _J Cj R0")).sendKeys("Club Mahindra", Keys.ENTER);
        List<WebElement> result = driver.findElements(By.className("result-title"));
        for (WebElement res : result) {
            System.out.println(res);

        }


    }
}
