package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Script3 {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total Links on webpage:" + linkElements.size());

        driver.close();
    }
}
