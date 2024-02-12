package SeleniumFunctions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class Framehandling extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://docs.oracle.com/javase/7/docs/api/");

        driver.switchTo().frame("packageListFrame");

        driver.findElement(By.linkText("java.applet")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Applet")).click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("Serialized Form")).click();

    }
}
