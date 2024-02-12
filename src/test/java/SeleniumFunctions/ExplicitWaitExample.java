package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ExplicitWaitExample extends BaseClass {


    @Test
    public void byid() {

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        WebElement element = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        //WebDriverWait w = new WebDriverWait(driver, 10);
        //w.until(ExpectedConditions.visibilityOf(element));

        Assert.assertEquals(element.getText(), "Hello World!");
        System.out.println(element.getText());


    }
}
