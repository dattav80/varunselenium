package practiceSowmya;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook extends BaseClass {

    @BeforeMethod
    public void launch() {
        driver.get("https://www.facebook.com");
        System.out.println("-------Facebook launched--------");
    }

    @Test(dataProvider = "testdata")
    public void login(String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(5000);

    }

    @DataProvider
    public Object[][] testdata() {
        Object[][] data = new Object[2][2];
        data[0][0] = "test@gmail.com";
        data[0][1] = "sample";
        data[1][0] = "test2@gmail.com";
        data[1][1] = "test";
        return data;
    }
}
