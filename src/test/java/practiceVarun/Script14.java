package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Script14 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        List<WebElement> elems = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(elems);

    }
}
