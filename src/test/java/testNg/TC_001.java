package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass {


    @BeforeMethod
    public void beforemethod() {
        System.out.println("************** Before method ******************");
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("************** After Method ******************");
    }

    @Test
    public void getTitle() {

        System.out.println("Title: " + driver.getTitle());
        Reporter.log("Title: " + driver.getTitle());
    }


}
