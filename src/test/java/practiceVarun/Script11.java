package practiceVarun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11 {

    public static void main(String[] args)  {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();

        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.close();


    }
}
