package practiceVarun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Script5 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
        System.out.println("Page Title:" + driver.getTitle());
        System.out.println("Page Url:" + driver.getCurrentUrl());

        boolean flag = false;
        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")){
            System.out.println("Test has passed");
            flag = true;
        }else{
            System.out.println("Test has failed");
        }

        Assert.assertTrue(flag);



    }
}
