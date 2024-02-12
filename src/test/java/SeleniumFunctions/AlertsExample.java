package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class AlertsExample extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(2000);
        Generic.dismissAlert(driver);
        Thread.sleep(2000);

        driver.findElement(By.xpath(" //button[text()='Click for JS Prompt']")).click();

        Thread.sleep(2000);
        Generic.acceptAlert(driver, "Hello all");

        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();

        System.out.println("Result: " + result);


    }
}
