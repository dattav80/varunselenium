package practiceVarun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.manage().window().maximize();

        //Switch to product page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();






    }
}
