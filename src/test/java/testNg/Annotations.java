package testNg;

import org.testng.annotations.*;

public class Annotations {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }


    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @Test
    public void test() {
        System.out.println("test");
    }
}
