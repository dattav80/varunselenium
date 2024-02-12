package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_003 extends BaseClass {

    @BeforeMethod
    public void beforemethod() {
        System.out.println("************** Before method ******************");
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }

    @Test(dataProvider = "testdata")
    public void getTitle(String email, String password) throws InterruptedException {
        WebElement emailTextField = driver.findElement(By.id("Email"));
        WebElement passwordTextField = driver.findElement(By.id("Password"));
        Thread.sleep(2000);
        emailTextField.clear();
        emailTextField.sendKeys(email);
        Thread.sleep(2000);
        passwordTextField.clear();
        passwordTextField.sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }


    @DataProvider
    public Object[][] testdata() {
        Object[][] data = new Object[3][2];
        data[0][0] = "Arvind@gmail.com";
        data[0][1] = "Arvind@g1323";
        data[1][0] = "varun@gmail.com";
        data[1][1] = "Arvind@g1323";
        data[2][0] = "admin@yourstore.com";
        data[2][1] = "admin";
        return data;
    }

}
