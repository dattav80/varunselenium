package testNg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static ExtentReports reports;
    protected WebDriver driver;
    protected ExtentSparkReporter spark;

    @BeforeSuite
    public void report() {
        reports = new ExtentReports();
        spark = new ExtentSparkReporter("./index.html");
        spark.config().setDocumentTitle("Automation Reports");
        spark.config().setReportName("Arvind");
        spark.config().setTheme(Theme.DARK);
        reports.attachReporter(spark);

    }

    @AfterSuite
    public void endReport() {
        reports.flush();
    }

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }


}
