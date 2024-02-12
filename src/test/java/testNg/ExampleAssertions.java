package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleAssertions extends BaseClass {

    @Test
    public void hardAssertions() {

        System.out.println("Starting...");

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        Assert.assertEquals(title, "Google", "Title mismatch!");

        System.out.println("Ending...");

    }

    @Test(priority = 1)
    public void softAssertions() {

        System.out.println("Starting...");

        driver.get("https://www.amazon.in");

        String title = driver.getTitle();
        SoftAssert sf = new SoftAssert();

        sf.assertEquals(title, "Google", "Title mismatch!");

        System.out.println("Ending...");
        sf.assertAll();

    }
}
