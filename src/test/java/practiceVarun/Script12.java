package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Script12 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions act= new Actions(driver);
        act.contextClick(button).build().perform();

    }
}
