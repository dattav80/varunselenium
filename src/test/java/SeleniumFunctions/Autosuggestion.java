package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

import java.util.List;

public class Autosuggestion extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.redbus.in/");


        driver.findElement(By.cssSelector("#src")).sendKeys("Hyd");

        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        for (WebElement sr : src) {
            if (sr.getText().equalsIgnoreCase("Hydernagar, Hyderabad")) {
                sr.click();
                break;
            }
        }


        driver.findElement(By.cssSelector("#dest")).sendKeys("Bang");

        List<WebElement> dec = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        for (WebElement sr : src) {
            if (sr.getText().equalsIgnoreCase("Majestic, Bangalore")) {
                sr.click();
                break;
            }
        }

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        List<WebElement> cal = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));


        for (WebElement sr : cal) {
            if (!sr.getText().equals("Dec 2022")) {
                driver.findElement(By.xpath("//button[text()='>']")).click();
                break;
            }
        }

        Thread.sleep(3000);
        List<WebElement> cals = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));


        for (WebElement sr : cals) {
            if (sr.getText().equals("22")) {
                sr.click();
                break;
            }
        }
        Thread.sleep(3000);
    }
}
