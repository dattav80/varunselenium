package Reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class TC_HM_002 extends BaseClass {


    @Test
    public void TC_HM_002() {

        ExtentTest test = reports.createTest("TC_HM_002");
        driver.get("https://www.indusind.com/in/en/personal.html#");
        test.info("Current URL: " + driver.getCurrentUrl());
        try {
            driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        test.info(driver.getTitle());
        driver.findElement(By.linkText("Digital Banking")).click();
        test.info(driver.getTitle());

    }

}
