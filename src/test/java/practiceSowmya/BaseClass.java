package practiceSowmya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //    @AfterClass
//    public void teardown(){
//        driver.quit();
//    }
    public void scroll(WebElement ws, JavascriptExecutor js) {
        js.executeScript("arguments[0].scrollIntoView();", ws);
        ws.click();
    }
}
