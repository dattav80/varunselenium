package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

import java.util.List;

public class multiSelect extends BaseClass {


    @Test
    public void byid() throws InterruptedException {

        driver.get("file:///Users/aravindanathdm/Desktop/dummy.html");

        WebElement element = driver.findElement(By.id("course"));

        List<WebElement> course = driver.findElements(By.xpath("//select[@id='course']/option"));


        for (int i = 0; i < course.size(); i++)
            Generic.setectByINdex(element, i);

        Thread.sleep(5000);
        for (int i = 0; i < 3; i++)
            Generic.desetectByINdex(element, i);

    }
}
