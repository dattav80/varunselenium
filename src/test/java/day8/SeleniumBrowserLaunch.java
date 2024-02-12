package day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SeleniumBrowserLaunch {

    public static void main(String[] args) {
        WebDriver driver = null;
        if (Generic.getValue("browser").equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
        } else if (Generic.getValue("browser").equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
        }

        driver.get(Generic.getValue("url"));
        Generic.waitForElement(2000);

        driver.findElement(By.name("q")).sendKeys(Generic.getValue("TC001", "search"), Keys.ENTER);
        Generic.waitForElement(2000);
    }
}
