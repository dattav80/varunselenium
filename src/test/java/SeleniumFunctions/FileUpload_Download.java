package SeleniumFunctions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class FileUpload_Download extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/aravindanathdm/Downloads/JavaSelenium_Sowmya/src/test/java/SeleniumFunctions/Topics");

        Thread.sleep(3000);

        driver.findElement(By.id("file-submit")).click();


        Thread.sleep(3000);

        driver.get("https://the-internet.herokuapp.com/download");
        Thread.sleep(3000);
        driver.findElement(By.linkText("img.png")).click();
    }
}
